package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CreatePetTest {

    @Test
    public void createPet() {
        ArrayList<Pet> testList = new ArrayList<>();
        CreatePet createPet = new CreatePet();


        createPet.createPet(testList, "dog", "odie");



        Assert.assertTrue(!(testList.isEmpty()));


    }
}