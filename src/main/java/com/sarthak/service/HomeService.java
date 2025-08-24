package com.sarthak.service;

import com.sarthak.model.Home;
import com.sarthak.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
