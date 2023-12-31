package com.qa.Model;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age  = age;
    }

    //setters and getters for name and age
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract String sayHello();

    public abstract String move();

    public String toString(){
        return "Name: " + name + " Age: " + age;
    }
}
