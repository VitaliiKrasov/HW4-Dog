package com.soft;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DogTest {

    Dog d1 = new Dog("Name");
    Dog d2 = new Dog("Name");
    Dog d3 = new Dog("Yo");
    @Test
    void sameNames() {
        Assert.assertTrue(d1.sameNames(d2));
        Assert.assertFalse(d1.sameNames(d3));
    }
}