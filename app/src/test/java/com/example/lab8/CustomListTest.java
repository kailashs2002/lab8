package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    public City mockCity() {
        return new City("Edmonton", "AB");
    }

    public CustomList mockCityList() {
        return new CustomList(null, new ArrayList<>());
    }


    @Test
    public void addCityTest() {
        CustomList list1 = mockCityList();
        int listSize = list1.getCount();
        list1.addCity(mockCity());
        assertEquals(list1.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest() {
        CustomList list1 = mockCityList();
        City city1 = mockCity();
        list1.addCity(city1);
        assertTrue(list1.hasCity(city1));
    }

    @Test
    public void deleteCityTest(){
        CustomList list1 = mockCityList();
        City city1 = mockCity();
        list1.add(city1);
        assertTrue(list1.hasCity(city1));


        int listSize = list1.getCount();
        list1.deleteCity(city1);
        assertFalse(list1.hasCity(city1));
    }
}
