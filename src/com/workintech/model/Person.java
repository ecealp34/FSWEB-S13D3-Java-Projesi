package com.workintech.model;

public class Person {
    String firstname;
    String lastname;
    int age;
    double salary;
    boolean isOnlyChild;
    String[] pets;


    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
}
    public Person(String firstname, String lastname, int age, double salary, boolean isOnlyChild, String[] pets) {
        this(firstname, lastname, age);
        this.salary = salary;
        this.isOnlyChild = isOnlyChild;
        this.pets = pets;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

   public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
   }
   public String toString() {
        return String.format("Firstname: %s, Lastname: %s " + "Age: %d, salary: %.2f", firstname, lastname, age, salary);
   }



}
