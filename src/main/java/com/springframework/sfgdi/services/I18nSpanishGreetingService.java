package com.springframework.sfgdi.services;

//@Service("i18nService")
public class I18nSpanishGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}