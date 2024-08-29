package com.anhtan.foododering.service.implement;

import com.anhtan.foododering.model.Notification;
import com.anhtan.foododering.model.Order;
import com.anhtan.foododering.model.Restaurant;
import com.anhtan.foododering.model.User;
import com.anhtan.foododering.service.NotificationService;
import com.anhtan.foododering.repository.NotificationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NotificationServiceImp implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public Notification sendOrderStatusNotification(Order order) {
        Notification notification = new Notification();
        notification.setMessage("your order is "+order.getOrderStatus()+ " order id is - "+order.getId());
        notification.setCustomer(order.getCustomer());
        notification.setSentAt(new Date());

        return notificationRepository.save(notification);
    }

    @Override
    public void sendRestaurantNotification(Restaurant restaurant, String message) {

    }

    @Override
    public void sendPromotionalNotification(User user, String message) {

    }

    @Override
    public List<Notification> findUsersNotification(Long userId) {
        return notificationRepository.findByCustomerId(userId);
    }
}
