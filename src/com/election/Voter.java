package com.election;

public class Voter {
    private String name;
    private  int age;
    static final int VOTER_ELEGIBLE_AGE = 18;
    public Voter(){
        name = null;
        age = 0;
    }
    public String  ageCriteria(){
        if(age >= 18){
            return name + " elegible to vote";
        }else if(age == 0 || age < 18){
            return  name + " Not elegible to vote";
        }else {
            return "Age can't be negative or zero";
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return  name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public  int getAge(){
        return  age;
    }
}
