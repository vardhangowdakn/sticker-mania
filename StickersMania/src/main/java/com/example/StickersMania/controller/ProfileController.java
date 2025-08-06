package com.example.StickersMania.controller;

import com.example.StickersMania.dto.ProfileRequestDto;
import com.example.StickersMania.dto.ProfileResponseDto;
import com.example.StickersMania.service.IProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile")
@RequiredArgsConstructor

public class ProfileController {

    private final IProfileService iProfileService;;

    @GetMapping
    public ResponseEntity<ProfileResponseDto>getProfile(){
        ProfileResponseDto responseDto = iProfileService.getProfile();
        return  ResponseEntity.ok(responseDto);

    }

    @PutMapping
    public ResponseEntity<ProfileResponseDto> updateProfile(@Valid @RequestBody ProfileRequestDto profileRequestDto) {
        ProfileResponseDto responseDto = iProfileService.updateProfile(profileRequestDto);
        return ResponseEntity.ok(responseDto);
    }

}
