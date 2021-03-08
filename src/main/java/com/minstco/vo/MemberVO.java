package com.minstco.vo;


import com.minstco.dao.MemberDAO;

import java.sql.Timestamp;

public class MemberVO {

    private String id;
    private String password;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String gender;
    private char grade;
    private Timestamp date;
    private int total;
    private int discount;
    private double discountRate;

    public String getAddress() {
        return address;
    }

    public char getGrade() {
        return grade;
    }

    public Timestamp getDate() {
        return date;
    }

    public int getTotal() {
        return total;
    }

    public int getDiscount() {
        return discount;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
