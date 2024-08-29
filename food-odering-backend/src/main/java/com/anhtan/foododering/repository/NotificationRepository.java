package com.anhtan.foododering.repository;

import com.anhtan.foododering.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    public List<Notification> findByCustomerId(Long userId);
    public List<Notification> findByRestaurantId(Long restaurantId);
}