/**
 * Сreate class Dog with fields name, breed, age.
 * Declare enum for field breed.
 * Create 3 instances of type Dog.
 * Check if there is no two dogs with the same name.
 * Display the name and the kind of the oldest dog.
 */
package com.soft;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", Breed.CHIHUAHUA.name(), 5);
        Dog dog2 = new Dog("Charlie", Breed.BULLDOG.name(), 12);
        Dog dog3 = new Dog("Rocky", Breed.SMOOTH_FOX_TERRIER.name(), 8);

        if (dog1.sameNames(dog2) || dog2.sameNames(dog3)) {
            System.out.println("There is two dogs with the same name");
        } else System.out.println("There is no two dogs with the same name");

        Dog oldest = new Dog();
        if(dog1.olderThen(dog2)) {
            if(dog1.olderThen(dog3)) {
                oldest = dog1;
            } else oldest = dog3;
        } else if(dog2.olderThen(dog3)) {
            oldest = dog2;
        } else oldest = dog3;
        String result = "";
        System.out.println(String.format("The oldest is %1$s %2$s", oldest.getName(), oldest.getBreed()));
    }
}
