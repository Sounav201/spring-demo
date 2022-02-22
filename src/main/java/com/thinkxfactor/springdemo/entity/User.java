package com.thinkxfactor.springdemo.entity;

public class User {

    private String Id;
    private String name;
    private int age;
    private String Department;
    public String getName() {
        return name;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
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
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }

    
}
