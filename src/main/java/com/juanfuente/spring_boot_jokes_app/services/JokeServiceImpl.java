package com.juanfuente.spring_boot_jokes_app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
    public final ChuckNorrisQuotes chuckNorrisQuotes;
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
//    @Bean
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
