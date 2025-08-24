package com.sarthak.ai.services;

import com.sarthak.exception.ProductException;
import com.sarthak.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
