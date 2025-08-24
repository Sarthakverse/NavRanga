package com.sarthak.service.impl;

import com.sarthak.model.Deal;
import com.sarthak.model.HomeCategory;
import com.sarthak.repository.DealRepository;
import com.sarthak.repository.HomeCategoryRepository;
import com.sarthak.service.DealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DealServiceImpl implements DealService {
    private final DealRepository dealRepository;
    private final HomeCategoryRepository homeCategoryRepository;

    @Override
    public Deal createDeal(Deal deal) {
        HomeCategory category = homeCategoryRepository
                .findById(deal.getCategory().getId()).orElse(null);
        Deal newDeal = new Deal();
        newDeal.setCategory(category);
        newDeal.setDiscount(deal.getDiscount());
        return dealRepository.save(newDeal);
    }

    @Override
    public List<Deal> getDeals() {
        return dealRepository.findAll();
    }

    @Override
    public Deal updateDeal(Deal deal,Long id) throws Exception {
        Deal existingDeal = dealRepository.findById(id).orElse(null);
        HomeCategory category=homeCategoryRepository.findById(deal.getCategory().getId()).orElse(null);

        if(existingDeal!=null){
            if(deal.getDiscount()!=null){
                existingDeal.setDiscount(deal.getDiscount());
            }
            if(category!=null){
                existingDeal.setCategory(category);
            }
            return dealRepository.save(existingDeal);
        }
        throw new Exception("Deal not found");
    }

    @Override
    public void deleteDeal(Long id) throws Exception {
        Deal deal = dealRepository.findById(id).orElse(null);

        if (deal != null) {

            dealRepository.delete(deal);
        }

    }


}
