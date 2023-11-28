package com.maxGr.ecom.service;

import com.maxGr.ecom.model.Category;
import com.maxGr.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category readCategory(String categoryName) {
        return CategoryRepository.
    }
}
