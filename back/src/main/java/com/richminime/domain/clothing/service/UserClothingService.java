package com.richminime.domain.clothing.service;

import com.richminime.domain.clothing.constant.ClothingType;
import com.richminime.domain.clothing.dto.ClothingRequestDto.UserClothingUpdateRequestDto;
import com.richminime.domain.clothing.dto.ClothingRequestDto.UserClothingCreateRequestDto;
import com.richminime.domain.clothing.dto.ClothingResponseDto.UserClothingInfoResponseDto;

import java.util.List;

public interface UserClothingService {
    void addMyClothing(UserClothingCreateRequestDto userClothingCreateRequestDto);
    //내가 입고 있는 옷 정보 Character 갱신 -> 갈아입기
    void updateMyClothing(UserClothingUpdateRequestDto userClothingUpdateRequestDto);
    void deleteMyClothing(Long userClothingId);
    List<UserClothingInfoResponseDto> findAllMyClothingByType(ClothingType clothingType);
}
