package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.shopping.entity.Product;

import com.shopping.repository.ProductRepository;

@RestController

@RequestMapping("/products")

public class ProductController {

    @Autowired

    ProductRepository repository;

    @GetMapping

    public List<Product> getProducts(){

        return repository.findAll();

    }

    @PostMapping

    public Product save(@RequestBody Product p){

        return repository.save(p);

    }

}