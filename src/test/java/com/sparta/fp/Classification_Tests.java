package com.sparta.fp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Tests {
    @Test
    @DisplayName("Check that an age lower than 12 returns\"U, PG & 12 films are available.\"")
    public void firstSegmentTest() {

        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(0));
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(3));
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(5));
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(11));
    }

    @Test
    @DisplayName("Check that an age lower than 15 returns\"U, PG, 12 & 15 films are available.\"")
    public void secondSegmentTest() {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(12));
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(14));
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(13));
    }


    @Test
    @DisplayName("Check that an age lower than 18 returns\"U, PG, 12 & 15 and lower than 18 films are available\"")
    public void thirdSegmentTest() {
        Assertions.assertEquals("U, PG, 12 & 15 and lower than 18 films are available",FilmClassifications.availableClassifications((15)));
        Assertions.assertEquals("U, PG, 12 & 15 and lower than 18 films are available",FilmClassifications.availableClassifications((16)));
        Assertions.assertEquals("U, PG, 12 & 15 and lower than 18 films are available",FilmClassifications.availableClassifications((17)));
    }


    @Test
    @DisplayName("Check that an age greater than 18 returns\"Suitable only for adult\"")
    public void fourthSegmentTest(){
        Assertions.assertEquals("Suitable only for adult",FilmClassifications.availableClassifications(18));
        Assertions.assertEquals("Suitable only for adult",FilmClassifications.availableClassifications(19));
        Assertions.assertEquals("Suitable only for adult",FilmClassifications.availableClassifications(40));
        Assertions.assertEquals("Suitable only for adult",FilmClassifications.availableClassifications(119));
    }

    @Test
    @DisplayName("Check for \"No one can live beyond that age\"")
    public void outSegmentTest(){
        Assertions.assertEquals("No one can live beyond that age",FilmClassifications.availableClassifications(120));
        Assertions.assertEquals("No one can live beyond that age",FilmClassifications.availableClassifications(121));
    }
}
