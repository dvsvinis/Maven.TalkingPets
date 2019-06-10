package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class OutputTest {

    @Test
    public void listSortedByName() {
        ArrayList<Pet> testList = new ArrayList<>();
        Pet dog1 = new Dog("Odie");
        Pet cat1 = new Cat("Garfield");
        Output myOutput = new Output();

        testList.add(dog1);
        testList.add(cat1);

        myOutput.listSortedByName(testList);

        String expected = "[Pet list: name: Garfield cat\n" +
                ", Pet list: name: Odie dog\n" +
                "]";

        Assert.assertEquals(expected, Arrays.toString(testList.toArray()));



    }

    @Test
    public void listSortedByType() {
        ArrayList<Pet> testList = new ArrayList<>();
        Pet dog1 = new Dog("Bob");
        Pet cat1 = new Cat("Garfield");
        Output myOutput = new Output();

        testList.add(dog1);
        testList.add(cat1);

        myOutput.listSortedByType(testList);

        String expected = "[Pet list: name: Garfield cat\n" +
                ", Pet list: name: Bob dog\n" +
                "]";

        Assert.assertEquals(expected, Arrays.toString(testList.toArray()));


    }

    @Test
    public void petSpeak() {

        ArrayList<Pet> testList = new ArrayList<>();
        Pet dog1 = new Dog("Odie");
        Pet cat1 = new Cat("Garfield");
        Output myOutput = new Output();

        testList.add(dog1);
        testList.add(cat1);

        myOutput.petSpeak(testList);

        String expected = "[Pet list: name: Odie dog\n" +
                ", Pet list: name: Garfield cat\n" +
                "]";

        Assert.assertEquals(expected, Arrays.toString(testList.toArray()));
    }
}