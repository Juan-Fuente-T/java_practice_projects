package com.juanfuente.sfg_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("EN")
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingServices implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
