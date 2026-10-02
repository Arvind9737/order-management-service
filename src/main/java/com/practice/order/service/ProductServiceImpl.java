package com.practice.order.service;

import com.practice.order.dto.ProductRequest;
import com.practice.order.dto.ProductResponse;
import com.practice.order.entity.Product;
import com.practice.order.exception.ResourceNotFoundException;
import com.practice.order.mapper.ProductMapper;
import com.practice.order.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
       Product product = productRepository.save(ProductMapper.toEntity(productRequest));
        return (ProductMapper.toResponse(product));
    }

    @Override
    public List<ProductResponse> getAll() {
      List<Product> result  = productRepository.findAll();
        return result.stream().map(ProductMapper :: toResponse).collect(Collectors.toList());

    }

    @Override
    public ProductResponse getById(Long id) {
        Product product =  productRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Product is not available"));
        return ProductMapper.toResponse(product);
    }


}
