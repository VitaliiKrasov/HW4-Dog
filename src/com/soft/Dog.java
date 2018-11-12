/**
 * Сreate class Dog with fields name, breed, age.
 * Declare enum for field breed.
 * Create 3 instances of type Dog.
 * Check if there is no two dogs with the same name.
 * Display the name and the kind of the oldest dog.
 */
package com.soft;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    boolean sameNames(Dog dog) {
        if(this.name == dog.name) {
            return true;
        }return false;
    }
}
