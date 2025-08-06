package com.example.StickersMania.service.impl;

import com.example.StickersMania.dto.ContactDto;
import com.example.StickersMania.dto.ProductDto;
import com.example.StickersMania.entity.Contact;
import com.example.StickersMania.entity.Product;
import com.example.StickersMania.repository.ContactRepository;
import com.example.StickersMania.repository.ProductRepository;
import com.example.StickersMania.service.IContactService;
import com.example.StickersMania.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {
    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactDto contactDto) {
            Contact contact= transformToEntity(contactDto);
            contactRepository.save(contact);
            return true;


    }

    private Contact transformToEntity(ContactDto contactDto){
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactDto,contact);
        return contact;
    }
}
