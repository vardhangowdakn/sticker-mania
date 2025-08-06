package com.example.StickersMania.controller;

import com.example.StickersMania.dto.ProductDto;
import com.example.StickersMania.entity.Product;
import com.example.StickersMania.repository.ProductRepository;
import com.example.StickersMania.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor

public class ProductController {


    private final IProductService iProductService;

    @GetMapping
    public ResponseEntity<List<ProductDto>>getProducts(){

        List<ProductDto> productList = iProductService.getProducts();
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }
}
