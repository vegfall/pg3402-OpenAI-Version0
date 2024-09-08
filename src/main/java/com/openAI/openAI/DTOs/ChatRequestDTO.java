package com.openAI.openAI.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ChatRequestDTO {
    private String model;
    private List<MessageDTO> messages;
    //private int n; commented till I find a better name
    private double temperature;

    public ChatRequestDTO(String model, String prompt) {
        this.model = model;

        this.messages = new ArrayList<>();
        this.messages.add(new MessageDTO("user", prompt));
    }
}
