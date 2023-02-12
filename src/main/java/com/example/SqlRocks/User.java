package com.example.SqlRocks;

//This is the model layer or entity layer
//Entities or models are objects which represent the data

//for each model create separate controller,service and repository layer.

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //to mark this class as an entity.// Attributes of the table are referenced to create column of table
@Table(name = "user_info") // Set name of the default// by default table name is same as entity name
public class User {


    @Id //used to mark the attribute as Primary Key of table//use jakarta annotation if 2 options are there
    private int id;

    private String name;
    @Column(name = "Age") //to change the coloumn name in table// by default it's same as attribute name
    private int age;

    @Column(name = "Phone number",unique = true) //make the mobile number as unique key
    private int mobileNo;



    public User() { //mandatory , as spring uses default constructor to create bean.
    }

    public User(int id, String name, int age,int mobileNo) { //optional
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNo=mobileNo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }


}
