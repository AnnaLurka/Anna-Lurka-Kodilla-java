package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        List<Country> continents = new ArrayList<>();
        continents.add(new Country("poland", new BigDecimal("37000000")));
        continents.add(new Country("germany", new BigDecimal("82000000")));
        continents.add(new Country("slovakia", new BigDecimal("5000000")));
        continents.add(new Country("southAfrica", new BigDecimal("58000000")));
        continents.add(new Country("egypt", new BigDecimal("101000000")));
        continents.add(new Country("nigeria", new BigDecimal("201000000")));
        continents.add(new Country("china", new BigDecimal("1393000000")));
        continents.add(new Country("india", new BigDecimal("1369000000")));
        continents.add(new Country("japan", new BigDecimal("126000000")));

        //When
        World world = new World();
        world.getPeopleQuantity();

        //Then
        Assert.assertEquals("3372000000", world.getPeopleQuantity());
    }
}

