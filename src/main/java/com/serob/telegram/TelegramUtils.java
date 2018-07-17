package com.serob.telegram;

/**
 * Created by Serob on 18.07.2018.
 */
public class TelegramUtils {
    public static final String COMMAND_STARTER = "/";

    public static boolean isCommand(String text){
        return text != null && text.startsWith(COMMAND_STARTER);
    }
}

