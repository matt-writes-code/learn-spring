package com.amigoscode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyConfigurationService configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyConfigurationService retrieveAllCurrencyConfiguration(){
        return configuration;
    }
}
