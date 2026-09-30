package com.example.practica_01_asistente_medico_ollama;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Practica01AsistenteMedicoOllamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practica01AsistenteMedicoOllamaApplication.class, args);
	}

	@Bean
	ChatClient getClient(ChatModel chatModel) {
		return ChatClient.builder(chatModel).build();
	}

}
