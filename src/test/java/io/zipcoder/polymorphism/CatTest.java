package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {


    @Test
    public void speak() {
        Pet thisCat = new Cat("Sylvester");
        Pet thatCat = new Cat("Garfield");
        String expected = "Meow!";

        Assert.assertEquals(expected, thisCat.speak());

    }

    @Test
    public void getNameTest() {
        Pet thisCat = new Cat("Sylvester");
        Pet thatCat = new Cat("Garfield");
        String expected = "Sylvester";

        Assert.assertEquals(expected, thisCat.getName());
    }


    @Test
    public void getNameTest2() {
        Pet thisCat = new Cat("Sylvester");
        Pet thatCat = new Cat("Garfield");
        String expected = "Garfield";

        Assert.assertEquals(expected, thatCat.getName());
    }


    @Test
    public void compareTo() {
        Pet thisCat = new Cat("Sylvester");
        Pet thatCat = new Cat("Garfield");
        int greaterThan = 0;

        Assert.assertTrue(greaterThan < thisCat.compareTo(thatCat));
    }

    @Test
    public void compareTo2() {
        Pet thisCat = new Cat("Sylvester");
        Pet thatCat = new Cat("Sylvester");

        int equalTo = 0;

        Assert.assertTrue(equalTo == thisCat.compareTo(thatCat));

    }


    @Test
    public void compareTo3() {


        Pet thisCat = new Cat("Sylvester");
        Pet thatCat = new Cat("Garfield");

        int lessThan = 0;

        Assert.assertTrue(lessThan > thatCat.compareTo(thisCat));
    }
}