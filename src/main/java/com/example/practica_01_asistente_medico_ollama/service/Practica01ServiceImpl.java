package com.example.practica_01_asistente_medico_ollama.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class Practica01ServiceImpl implements Practica01Service {

    ChatClient chatClient;

    public Practica01ServiceImpl(ChatClient chatClient) {
        super();
        this.chatClient = chatClient;
    }

    @Override
    public String getRespuestaLLM(String sintoma) {
        String userText = "Dime a qué se deben las siguientes dolencias: " + sintoma;
        String instrucciones = "El usuario te va a preguntar por las dolencias que tiene. Tienes que contestarle las causas de dichas dolencias, pero siempre recomendando que vaya al especialista.";
        return chatClient.prompt().system(instrucciones).user(userText).call().content();
    }

}
