package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {
    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "seoul");
        assertEquals("Bob zip", restaurant.getName());
        assertEquals("seoul", restaurant.getAddress());
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "seoul");
        assertEquals("Bob zip in seoul", restaurant.getInfomation());
    }

}