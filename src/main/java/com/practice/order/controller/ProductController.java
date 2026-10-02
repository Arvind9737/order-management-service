package com.practice.order.controller;

import com.practice.order.dto.ProductRequest;
import com.practice.order.dto.ProductResponse;
import com.practice.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest){
        ProductResponse productResponse  = productService.create(productRequest);
        return new ResponseEntity<ProductResponse>(HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ProductResponse>> getAll(){
        List<ProductResponse> productResponse = productService.getAll();
       return  ResponseEntity.ok(productResponse);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ProductResponse> getById( @PathVariable Long id){
        ProductResponse productResponse = productService.getById(id);
        return ResponseEntity.ok(productResponse);
    }
}
