package com.example.urlshortener.services;

import org.springframework.stereotype.Service;

@Service
public class URLShortenerService {

    public String getShortURL(String token) {


        return null;
    }

    public String getLongURL(String shortUrl) {

        return null;
    }

    private String getRandomChars() {
        String randomStr = "";
        String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 5; i++)
            randomStr += possibleChars.charAt((int) Math.floor(Math.random() * possibleChars.length()));
        return randomStr;
    }
}
