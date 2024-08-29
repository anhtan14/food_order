package com.anhtan.foododering.service;

import com.anhtan.foododering.model.Notification;
import com.anhtan.foododering.model.Order;
import com.anhtan.foododering.model.Restaurant;
import com.anhtan.foododering.model.User;

import java.util.List;

public interface NotificationService {
    public Notification sendOrderStatusNotification(Order order);
    public void sendRestaurantNotification(Restaurant restaurant, String message);
    public void sendPromotionalNotification(User user, String message);

    public List<Notification> findUsersNotification(Long userId);
}
