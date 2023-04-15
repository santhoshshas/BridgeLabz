package com.Program.Review_2;

enum Department {
    ONCOLOGY,
    NEUROLOGY,
    CARDIOLOGY,
    GYNOCOLOGY
}

public class Patient {
    private String name;
    private int age;
    private String phoneNumber;
    private String city;
    private String state;
    private Department department;

    public Patient(String name, int age, String phoneNumber, String city, String state, Department department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Department getDepartment() {
        return department;
    }
}
