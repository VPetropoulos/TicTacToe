package com.myfirstapp.billys.tictactoe;



import org.jibble.pircbot.PircBot;

public class PIRCBOT extends PircBot {

    public PIRCBOT() {
        this.setName("MyBot");
    }


    public void onMessage(String channel, String sender,
                          String login, String hostname, String message) {
        if (message.equalsIgnoreCase("time")) {
            String time = new java.util.Date().toString();
            sendMessage(channel, sender + ": The time is now " + time);
        }
    }

}
