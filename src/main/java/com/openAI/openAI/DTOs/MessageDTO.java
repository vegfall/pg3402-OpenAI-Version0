package com.openAI.openAI.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MessageDTO {
    private String role;
    private String content;
}
