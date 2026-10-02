package com.practice.order.mapper;

import com.practice.order.dto.ProductRequest;
import com.practice.order.dto.ProductResponse;
import com.practice.order.entity.Product;

public class ProductMapper {

    public static Product toEntity(ProductRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setQuantity(productRequest.getQuantity());
        return product;
    }

    public static ProductResponse toResponse(Product product){
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setDescription(product.getDescription());
        productResponse.setPrice(product.getPrice());
        productResponse.setQuantity(product.getQuantity());
        return productResponse;
    }
}
