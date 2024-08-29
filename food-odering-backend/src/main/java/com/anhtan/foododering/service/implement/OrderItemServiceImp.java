package com.anhtan.foododering.service.implement;

import com.anhtan.foododering.model.OrderItem;
import com.anhtan.foododering.repository.OrderItemRepository;
import com.anhtan.foododering.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImp implements OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem createOrderIem(OrderItem orderItem) {

        OrderItem newOrderItem=new OrderItem();
        newOrderItem.setQuantity(orderItem.getQuantity());
        return orderItemRepository.save(newOrderItem);
    }
}
