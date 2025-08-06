package com.example.StickersMania.controller;

import com.example.StickersMania.dto.ContactDto;
import com.example.StickersMania.dto.ProductDto;
import com.example.StickersMania.service.IContactService;
import com.example.StickersMania.service.IProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/contacts")
@RequiredArgsConstructor

public class ContactController {


    private final IContactService iContactService;

    @PostMapping
    public ResponseEntity<String> saveContact(@Valid @RequestBody ContactDto contactDto){

         iContactService.saveContact(contactDto);


        return ResponseEntity.status(HttpStatus.CREATED).body("Request processed successfully");


    }
}
