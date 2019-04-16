package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sezam")
                .burgers(2)
                .sauce("standart")
                .ingredients("onion")
                .ingredients("bacon")
                .ingredients("chilli")
                .build();
        System.out.println(bigmac);
        //When
        int countIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3,countIngredients);
    }
}
