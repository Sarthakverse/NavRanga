package com.sarthak.response;

import com.sarthak.dto.OrderHistory;
import com.sarthak.model.Cart;
import com.sarthak.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
