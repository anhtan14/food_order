package com.anhtan.foododering.service;

import com.anhtan.foododering.model.Order;
import com.anhtan.foododering.model.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
    public PaymentResponse generatePaymentLink(Order order) throws StripeException;
}
