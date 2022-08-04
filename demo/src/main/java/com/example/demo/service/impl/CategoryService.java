package com.example.demo.service.impl;

import com.example.demo.DAO.CategoryRepository;
import com.example.demo.model.Category;
import com.example.demo.service.ICRUDService;

import java.util.ArrayList;

public class CategoryService implements ICRUDService<Category> {
    private final CategoryRepository categoryRepository = new CategoryRepository();
    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id);
    }

    @Override
    public ArrayList<Category> findAll() {
        return  categoryRepository.findAll();
    }

    @Override
    public void create(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void deleteById(int id) {

    }
}
