package com.example.demo.scene.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SceneUpdateVisibilityRequest {
    @JsonProperty("isMessageVisible")
    private boolean isMessageVisible;
}
