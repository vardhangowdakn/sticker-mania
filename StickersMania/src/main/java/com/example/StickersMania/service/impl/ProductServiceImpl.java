package com.example.StickersMania.service.impl;

import com.example.StickersMania.dto.ProductDto;
import com.example.StickersMania.entity.Product;
import com.example.StickersMania.repository.ProductRepository;
import com.example.StickersMania.service.IProductService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final  ProductRepository productRepository;
    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream().map(this::transformToDTO).collect(Collectors.toList());
    }

    private ProductDto transformToDTO(Product product){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        productDto.setProductId(product.getId());
        return productDto;
    }
}
