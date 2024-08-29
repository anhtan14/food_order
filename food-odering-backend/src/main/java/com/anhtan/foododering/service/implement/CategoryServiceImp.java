package com.anhtan.foododering.service.implement;

import com.anhtan.foododering.Exception.RestaurantException;
import com.anhtan.foododering.model.Category;
import com.anhtan.foododering.model.Restaurant;
import com.anhtan.foododering.repository.CategoryRepository;
import com.anhtan.foododering.service.CategoryService;
import com.anhtan.foododering.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public Category createCategory(String name,Long userId) throws RestaurantException {
        Restaurant restaurant=restaurantService.getRestaurantsByUserId(userId);
        Category createdCategory=new Category();

        createdCategory.setName(name);
        createdCategory.setRestaurant(restaurant);
        return categoryRepository.save(createdCategory);
    }

    @Override
    public List<Category> findCategoryByRestaurantId(Long id) throws RestaurantException {
        Restaurant restaurant=restaurantService.findRestaurantById(id);
        return categoryRepository.findByRestaurantId(id);
    }

    @Override
    public Category findCategoryById(Long id) throws RestaurantException {
        Optional<Category> opt=categoryRepository.findById(id);

        if(opt.isEmpty()) {
            throw new RestaurantException("category not exist with id "+id);
        }

        return opt.get();
    }
}
