package com.sarthak.service;

import com.sarthak.model.Seller;
import com.sarthak.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
