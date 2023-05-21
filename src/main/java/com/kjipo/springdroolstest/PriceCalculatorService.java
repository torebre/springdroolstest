package com.kjipo.springdroolstest;

import com.kjipo.springdroolstest.Price;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PriceCalculatorService {

    private KieContainer kieContainer;

    public PriceCalculatorService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }


    public Price calculatePrice(Order order) {
        KieSession kieSession = kieContainer.newKieSession();

        var price = new Price(0, 0);
        kieSession.setGlobal("finalPrice", price);
        kieSession.insert(order);
        kieSession.fireAllRules();
        kieSession.dispose();

        return price;
    }


}
