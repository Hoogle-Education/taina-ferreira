package model;

public class Person {

    private String name;
    private int age;
    private double height;
    private String phoneNumber;

    public Person() {
    }

    public Person(String name, int age, double height, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
