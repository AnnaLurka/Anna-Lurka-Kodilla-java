package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

   // private final List<Continent> continents = new ArrayList<>();


    public BigDecimal getPeopleQuantity(List<Country> continents) {

        return continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        }
    }


