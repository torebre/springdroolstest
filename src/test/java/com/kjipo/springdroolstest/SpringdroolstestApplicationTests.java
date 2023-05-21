package com.kjipo.springdroolstest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest
class SpringdroolstestApplicationTests {

    @Autowired
    private PriceCalculatorService priceCalculatorService;


    @Test
    void testRule() {
        var item = new Item("Test", new Price(100, 0));
        var item2 = new Item("Test2", new Price(100, 50));
        var item3 = new Item("Test3", new Price(50, 0));

        var itemsInOrder = new ArrayList<Item>();
        itemsInOrder.add(item);
        itemsInOrder.add(item2);
        itemsInOrder.add(item3);

        var order = new Order(itemsInOrder);

        var totalPrice = priceCalculatorService.calculatePrice(order);

        assertThat(totalPrice, notNullValue());
    }

}
