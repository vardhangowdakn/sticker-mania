package com.example.StickersMania.service;

import com.example.StickersMania.dto.ProfileRequestDto;
import com.example.StickersMania.dto.ProfileResponseDto;

public interface IProfileService {

    ProfileResponseDto getProfile();

    ProfileResponseDto updateProfile(ProfileRequestDto profileRequestDto);
}
