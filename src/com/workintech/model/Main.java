package com.workintech.model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        person.pets = new String[2];
        person.pets[0] = "cat";
        person.pets[1] = "dog";
        System.out.println(Arrays.toString(person.pets));
        person.salary = 25000;
        System.out.println(person);

        System.out.println("Person------");
        System.out.println("Firstname: " + person.getFirstname());
        System.out.println("Lastname: " + person.getLastname());
        System.out.println("Age: " + person.getAge());
        System.out.println(person.salary);

        System.out.println("Wall------");
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println("Wall------");
        Wall wall2 = new Wall(-5, -4);
        System.out.println("Wall2 width= " + wall2.width);
        System.out.println("Wall2 height= " + wall2.height);

    }
}