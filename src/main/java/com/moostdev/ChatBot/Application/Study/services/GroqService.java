package com.moostdev.ChatBot.Application.Study.services;

import com.moostdev.ChatBot.Application.Study.dto.ChatRequestDTO;
import com.moostdev.ChatBot.Application.Study.dto.ChatResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GroqService {
    private final RestTemplate groqRestTemplate;
    private static final String API_URL = "https://api.groq.com/openai/v1/chat/completions";

    public GroqService(RestTemplate groqRestTemplate) {
        this.groqRestTemplate = groqRestTemplate;
    }

    public String generateResponse(String userMessage) {
        // Create Message manually
        ChatRequestDTO.Message message = new ChatRequestDTO.Message();
        message.setRole("user");
        message.setContent(userMessage);

        // Create ChatRequestDTO manually
        ChatRequestDTO request = new ChatRequestDTO();
        request.setModel("llama-3.3-70b-versatile");
        request.setMessages(List.of(message));
        request.setTemperature(0.7);

        ChatResponseDTO response = groqRestTemplate.postForObject(
                API_URL,
                request,
                ChatResponseDTO.class
        );

        if (response != null && response.getChoices() != null && !response.getChoices().isEmpty()) {
            return response.getChoices().get(0).getMessage().getContent();
        }
        return "Sorry, I couldn't process that request.";
    }
}