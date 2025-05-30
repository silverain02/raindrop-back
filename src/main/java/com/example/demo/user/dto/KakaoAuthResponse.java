package com.example.demo.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class KakaoAuthResponse {
    private String accessToken;
    private String refreshToken;
}
