package com.anhtan.foododering.repository;

import com.anhtan.foododering.model.Cart;
import com.anhtan.foododering.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


}
