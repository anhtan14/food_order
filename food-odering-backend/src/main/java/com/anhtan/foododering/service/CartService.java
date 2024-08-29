package com.anhtan.foododering.service;

import com.anhtan.foododering.Exception.CartException;
import com.anhtan.foododering.Exception.CartItemException;
import com.anhtan.foododering.Exception.FoodException;
import com.anhtan.foododering.Exception.UserException;
import com.anhtan.foododering.model.Cart;
import com.anhtan.foododering.model.CartItem;
import com.anhtan.foododering.request.AddCartItemRequest;

public interface CartService {

    public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

    public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

    public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

    public Long calculateCartTotals(Cart cart) throws UserException;

    public Cart findCartById(Long id) throws CartException;

    public Cart findCartByUserId(Long userId) throws CartException, UserException;

    public Cart clearCart(Long userId) throws CartException, UserException;

}
