package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("cucumber")
                .bun("withSesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredients("lettuce")
                .ingredients("onion")
                .build();

        System.out.println(bigmac);

        //When
        int howManyngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(3,howManyngredients);

    }
}
