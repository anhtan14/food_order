package com.anhtan.foododering.service;

import com.anhtan.foododering.model.Category;
import com.anhtan.foododering.Exception.RestaurantException;

import java.util.List;

public interface CategoryService {

    public Category createCategory (String name,Long userId) throws RestaurantException;

    public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;

    public Category findCategoryById(Long id) throws RestaurantException;
}
