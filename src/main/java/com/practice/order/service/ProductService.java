package com.practice.order.service;

import com.practice.order.dto.ProductRequest;
import com.practice.order.dto.ProductResponse;
import com.practice.order.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    ProductResponse create(ProductRequest productRequest);

    List<ProductResponse> getAll();

    ProductResponse getById( Long id);
}


