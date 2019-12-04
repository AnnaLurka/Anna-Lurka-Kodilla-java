package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        List<Country> europe = new ArrayList<>();
        europe.add(new Country("poland", new BigDecimal("37000000")));
        europe.add(new Country("germany", new BigDecimal("82000000")));
        europe.add(new Country("slovakia", new BigDecimal("5000000")));

        List<Country> africa = new ArrayList<>();
        africa.add(new Country("southAfrica", new BigDecimal("58000000")));
        africa.add(new Country("egypt", new BigDecimal("101000000")));
        africa.add(new Country("nigeria", new BigDecimal("201000000")));

        List<Country> asia = new ArrayList<>();
        asia.add(new Country("china", new BigDecimal("1393000000")));
        asia.add(new Country("india", new BigDecimal("1369000000")));
        asia.add(new Country("japan", new BigDecimal("126000000")));

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent(europe));
        continents.add(new Continent(africa));
        continents.add(new Continent(asia));

        //When
        World world = new World();
        world.getPeopleQuantity(continents);

        //Then
        BigDecimal result = new BigDecimal("3372000000");
        Assert.assertEquals(result, world.getPeopleQuantity(continents));
    }
}

