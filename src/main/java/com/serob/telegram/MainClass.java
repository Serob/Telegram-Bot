package com.serob.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by Serob on 16.07.2018.
 */
public class MainClass {

    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new GarfinqyulBot());
            System.out.println();
            System.out.println(" ---------------------");
            System.out.println(" Bot started ! ");
            System.out.println(" ---------------------");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
