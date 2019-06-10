package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @org.junit.Test
    public void speak() {
        Pet thisBird = new Bird("tweety");


        String expected  = "Chirp!";

        Assert.assertEquals(expected, thisBird.speak());

    }



    @Test
    public void getTypeTest(){
        Pet thisBird = new Bird("tweety");

        String expected = "bird";

        Assert.assertEquals(expected, thisBird.getType());

    }


    @Test

    public void getName(){
        Pet thisBird = new Bird ("tweety");
        String expected = "tweety";

        Assert.assertEquals(expected, thisBird.getName());
    }

    @org.junit.Test
    public void compareTo() {
        Pet thisBird = new Bird ("tweety");
        Pet thatBird = new Bird ("charles");

        int greaterThan = 0;

        Assert.assertTrue(greaterThan < thisBird.compareTo(thatBird));


    }

    @Test
    public void compareTo2() {
        Pet thisBird = new Bird ("tweety");
        Pet thatBird = new Bird ("tweety");

        int equalTo = 0;

        Assert.assertTrue(equalTo == thisBird.compareTo(thatBird));

    }


    @Test
    public void compareTo3() {


        Pet thisBird = new Bird("tweety");
        Pet thatBird = new Bird("charles");

        int lessThan = 0;

        Assert.assertTrue(lessThan > thatBird.compareTo(thisBird));
    }

    @Test
    public void toStringTest(){
        Pet thisBird = new Bird("tweety");

        String expected = "Pet list: name: tweety bird" + "\n";

        Assert.assertEquals(expected, thisBird.toString());

    }




}