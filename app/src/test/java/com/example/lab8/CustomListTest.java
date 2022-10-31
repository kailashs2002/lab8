package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
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
}
