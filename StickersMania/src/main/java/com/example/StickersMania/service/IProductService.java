package com.example.StickersMania.service;

import com.example.StickersMania.dto.ProductDto;
import com.example.StickersMania.entity.Product;

import java.util.List;

public interface IProductService {
    List<ProductDto> getProducts();
}
