package com.sarthak.service;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.sarthak.model.Order;
import com.sarthak.model.PaymentOrder;
import com.sarthak.model.User;

import java.util.Set;


public interface PaymentService {

    PaymentOrder createOrder(User user,
                             Set<Order> orders);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    PaymentOrder getPaymentOrderByPaymentId(String paymentId) throws Exception;

    Boolean ProceedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId, String paymentLinkId) throws RazorpayException;

    PaymentLink createRazorpayPaymentLink(User user,
                                          Long Amount,
                                          Long orderId) throws RazorpayException;

    String createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}
