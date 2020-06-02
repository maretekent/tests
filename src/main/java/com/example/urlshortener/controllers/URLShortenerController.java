package com.example.urlshortener.controllers;

import com.example.urlshortener.services.URLShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class URLShortenerController {

    @Autowired
    URLShortenerService urlShortenerService;

    @Value("${baseurl}")
    private String baseUrl;

    @RequestMapping(value="/s/{randomstring}", method= RequestMethod.GET)
    public void getFullUrl(HttpServletResponse response, @PathVariable("randomstring") String randomString) throws IOException {
        String shortUrl = baseUrl+"/s/" + randomString;
        String longUrl = urlShortenerService.getLongURL(shortUrl);
        response.sendRedirect(longUrl);
    }
}
