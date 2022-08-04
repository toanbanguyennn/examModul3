package com.example.demo.service.impl;

import com.example.demo.DAO.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.ICRUDService;

import java.util.ArrayList;

public class ProductService implements ICRUDService<Product> {
    private final ProductRepository productRepository = new ProductRepository();
    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public ArrayList<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);

    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
    public  ArrayList<Product> findByName(String name) {
        ArrayList<Product> products = findAll();
        ArrayList<Product> tempProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getNameProduct().toLowerCase().contains(name.toLowerCase())) {
                tempProducts.add(product);
            }
        }
        return tempProducts;
    }
}
