package com.anhtan.foododering.service;

import com.anhtan.foododering.Exception.FoodException;
import com.anhtan.foododering.Exception.RestaurantException;
import com.anhtan.foododering.model.Category;
import com.anhtan.foododering.model.Food;
import com.anhtan.foododering.model.Restaurant;
import com.anhtan.foododering.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req,Category category,
                           Restaurant restaurant) throws FoodException, RestaurantException;

    void deleteFood(Long foodId) throws FoodException;

    public List<Food> getRestaurantsFood(Long restaurantId,
                                         boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws FoodException;

    public Food updateAvailabilityStatus(Long foodId) throws FoodException;
}
