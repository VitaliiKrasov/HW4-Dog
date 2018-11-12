package com.soft;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DogTest {

    Dog d1 = new Dog("Name", Breed.BULLDOG.name(), 1);
    Dog d2 = new Dog("Name", Breed.CHIHUAHUA.name(), 12);
    Dog d3 = new Dog("Yo", Breed.AKITA.name(), 4);
    @Test
    void sameNames() {
        Assert.assertTrue(d1.sameNames(d2));
        Assert.assertFalse(d1.sameNames(d3));
    }
    @Test
    void olderThen() {
        Assert.assertTrue(d1.olderThen(d2));
        Assert.assertFalse(d1.olderThen(d3));
    }
}