package com.moostdev.ChatBot.Application.Study.controllers;

import com.moostdev.ChatBot.Application.Study.services.GroqService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ChatController {

    @Autowired
    private GroqService groqService;


    @PostMapping("/chat")
    public ResponseEntity<String> chat(@RequestBody String message){
        return ResponseEntity.ok(groqService.generateResponse(message));
    }
}
