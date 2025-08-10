package com.learning.springai;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/openai")
@CrossOrigin("*")
@RequiredArgsConstructor
public class OpenAIController {
	
	private final OpenAiChatModel chatModel;

	@GetMapping("/{message}")
	public ResponseEntity<String> getAnswer(@PathVariable String message)
	{
		String response = chatModel.call(message);
		return ResponseEntity.ok(response);
	}
	
}
