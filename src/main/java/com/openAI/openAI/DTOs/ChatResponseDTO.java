package com.openAI.openAI.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class ChatResponseDTO {
    private List<Choice> choices;

    @AllArgsConstructor
    @Getter
    @Setter
    public static class Choice {
        private int index;
        private MessageDTO message;
    }
}
