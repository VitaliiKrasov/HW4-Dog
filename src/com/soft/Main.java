package com.soft;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", Breed.CHIHUAHUA.name(), 5);
        Dog dog2 = new Dog("Charlie", Breed.BULLDOG.name(), 12);
        Dog dog3 = new Dog("Rocky", Breed.SMOOTH_FOX_TERRIER.name(), 8);
        System.out.println(dog1.sameNames(dog2));
    }
}
