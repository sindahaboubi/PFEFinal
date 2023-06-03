package com.ms.sauvegarderdossierservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer{

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new DossierSocketHandler(), "/dossier")
                .setAllowedOrigins("*");
    }
    @Bean
    public TextWebSocketHandler myWebSocketHandler() {
        return new DossierSocketHandler();
    }
    
}
