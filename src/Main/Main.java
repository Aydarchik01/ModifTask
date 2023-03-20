package Main;

import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name= "Murka";
        cat.color= "Oreng";
        Dog dog = new Dog();
        dog.name= "Ak-tosh";
        dog.color= "Blak";
        System.out.println("Dog name: "+dog.name+"\n"+"Dog color: "+dog.color+"\n");
        System.out.println("======================");
        System.out.println("Cat name: "+cat.name+"\n"+"Cat color: "+cat.color+"\n");
    }
}