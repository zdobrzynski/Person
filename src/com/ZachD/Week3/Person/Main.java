package com.ZachD.Week3.Person;

public class Main {

    public static void main(String[] args) {

        Person one = new Person();
        Person two = new Person("Jane", "Doe");
        Person three = new Person(28);
        Person four = new Person("Barb", 54);

        Person[] people = {one, two, three, four};

        for(int i = 0;i < people.length; i++){
            System.out.println(people[i].firstName + " " + people[i].lastName + " is " + people[i].getAge() + " years old.");
            if(i%2 > 0){
                people[i].loseWeight(45);
                System.out.println("They weigh " + people[i].getWeight() + "LBs.");
            }else{
                people[i].addWeight(65);
                System.out.println("They weigh " + people[i].getWeight() + "LBs.");
            }
        }

    }
}
