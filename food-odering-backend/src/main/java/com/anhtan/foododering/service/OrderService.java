package com.anhtan.foododering.service;

import com.anhtan.foododering.Exception.CartException;
import com.anhtan.foododering.Exception.OrderException;
import com.anhtan.foododering.Exception.RestaurantException;
import com.anhtan.foododering.Exception.UserException;
import com.anhtan.foododering.model.Order;
import com.anhtan.foododering.model.PaymentResponse;
import com.anhtan.foododering.model.User;
import com.anhtan.foododering.request.CreateOrderRequest;
import com.stripe.exception.StripeException;

import java.util.List;

public interface OrderService {

    public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;

    public Order updateOrder(Long orderId, String orderStatus) throws OrderException;

    public void cancelOrder(Long orderId) throws OrderException;

    public List<Order> getUserOrders(Long userId) throws OrderException;

    public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
}
