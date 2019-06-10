package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        Pet thisDog = new Dog("Odie");
        Pet thatDog = new Dog("Spot");

        String expected = "Woof!";

        Assert.assertEquals(expected, thatDog.speak());

    }

    @Test
    public void compareTo() {
        Pet thisDog = new Dog("Odie");
        Pet thatDog = new Dog("Spot");

        int lessThan = 0;

        Assert.assertTrue(lessThan > thisDog.compareTo(thatDog));

    }

    @Test
    public void getType(){
        Pet thisDog = new Dog("Odie");
        Pet thatDog = new Dog("Spot");

        String expected = "dog";

        Assert.assertEquals(expected, thisDog.getType());
    }
}