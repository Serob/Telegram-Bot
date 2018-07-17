package com.serob.telegram;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by Serob on 17.07.2018.
 */
public class GarfinqyulBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        String messageText = update.getMessage().getText();
        String firstName = update.getMessage().getFrom().getFirstName();

        System.out.println("MESSAGE FROM: " + firstName);

        if (!update.getMessage().hasText())
            return;

        System.out.println("TEXT: " + messageText);

        SendMessage response = new SendMessage();
        response.setChatId(update.getMessage().getChatId());

        switch (messageText){
            case "/start" :
            case "/help" :
                response.setText("Please, enter Your name)))");
                break;
            default :
                if(firstName.equalsIgnoreCase(messageText.trim())) {
                    response.setText("Hello, annnasun " + messageText);
                } else {
                    response.setText("I know that your name isn't " + messageText + ", annasun!");
                }
        }

        try {
            execute(response);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "Garfinqyul bot";
    }

    public String getBotToken() {
        return "663131521:AAGICw6AQiaxYv_AHOiTLu5ov5lqgns8Big";
    }
}
