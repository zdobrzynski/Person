package com.ZachD.Week3.Person;

public class Person implements Weighable{

    String firstName;
    String lastName;
    int age;
    static boolean hasExisted = true;
    double weight;

    public Person(){
        firstName = "Gen";
        lastName = "Eric";
        age = 5;
        weight = 150;
    }

    public Person(String firstName) {
        this.firstName = firstName;
        lastName = "Eric";
        age = 5;
        weight = 150;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        age = 5;
        weight = 150;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        weight = 150;
    }

    public Person(String firstName, int age){
        this.firstName = firstName;
        lastName = "Eric";
        this.age = age;
        weight = 150;
    }

    public Person(int age){
        firstName = "Gen";
        lastName = "Eric";
        this.age = age;
        weight = 150;
    }

    public boolean getExisted(){
        return hasExisted;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void addWeight(double pounds){
        weight += pounds;
    }
    public void loseWeight(double pounds){
        weight -= pounds;
    }
}
