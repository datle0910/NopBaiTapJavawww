package iuh.se.tuan03.entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String phone;
    private String gender;
    private String address;
    private String city;
    private String pincode;
    private String state;
    private String country;
    private String hobbies;
    private ArrayList<String> qualitification;
    private String courseApplies;

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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public ArrayList<String> getQualitification() {
        return qualitification;
    }

    public void setQualitification(ArrayList<String> qualitification) {
        this.qualitification = qualitification;
    }

    public String getCourseApplies() {
        return courseApplies;
    }

    public void setCourseApplies(String courseApplies) {
        this.courseApplies = courseApplies;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String email, String phone, String gender, String address, String city, String pincode, String state, String country, String hobbies, ArrayList<String> qualitification, String courseApplies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
        this.hobbies = hobbies;
        this.qualitification = qualitification;
        this.courseApplies = courseApplies;
    }
}
