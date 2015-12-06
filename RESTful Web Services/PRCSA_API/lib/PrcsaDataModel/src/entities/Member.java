/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 * This class represents an Member used by PRCSA LETS system
 *
 * @author BrianV
 */
public class Member {

    private Long id;
    private String forename;
    private String surname;
    private Date dob;
    private Long balance;
    private String addline1;
    private String addline2;
    private String city;
    private String postcode;
    private String contact_number;
    private String email;
    private String is_active;

    // Used to hold the hashed password as 
    // most web service requests require authentication.
    private String password;

    /**
     * Constructor creates a new instance of Member.
     */
    public Member() {
    }

    /**
     * Accessor method to retrieve the ID of the member.
     *
     * @return - A Long representing the ID of the member.
     */
    public Long getId() {
        return id;
    }

    /**
     * Accessor method to set the ID of the member.
     *
     * @param id - A Long representing the ID of the member.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Accessor method to retrieve the forename of the member.
     *
     * @return - A String representing the forename of the member.
     */
    public String getForename() {
        return forename;
    }

    /**
     * Accessor method to set the forename of the member.
     *
     * @param forename - A String representing the forename of the member.
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Accessor method to retrieve the surname of the member.
     *
     * @return - A String representing the surname of the member.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Accessor method to set the surname of the member.
     *
     * @param surname - A String representing the surname of the member.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Accessor method to retrieve the date of birth of the member
     *
     * @return - A Date object representing the date of birth of the member.
     */
    public Date getDob() {
        return dob;
    }

    /**
     * Accessor method to set the date of birth of the member
     *
     * @param dob - A Date object representing the date of birth of the member.
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * Accessor method to retrieve the member's balance.
     *
     * @return - A Long representing the member's balance.
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * Accessor method to set the member's balance
     *
     * @param balance - A Long representing the member's balance.
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * Accessor method to retrieve the first line of the member's address.
     *
     * @return - A String representing the first line of the member's address.
     */
    public String getAddline1() {
        return addline1;
    }

    /**
     * Accessor method to set the first line of the member's address.
     *
     * @param addline1 - A String representing the first line of the member's
     * address.
     */
    public void setAddline1(String addline1) {
        this.addline1 = addline1;
    }

    /**
     * Accessor method to retrieve the second line of the member's address.
     *
     * @return - A String representing the second line of the member's address.
     */
    public String getAddline2() {
        return addline2;
    }

    /**
     * Accessor method to set the second line of the member's address.
     *
     * @param addline2 - A String representing the second line of the member's
     * address.
     */
    public void setAddline2(String addline2) {
        this.addline2 = addline2;
    }

    /**
     * Accessor method to retrieve the city line of the member's address.
     *
     * @return - A String representing the city line of the member's address.
     */
    public String getCity() {
        return city;
    }

    /**
     * Accessor method to set the city line of the member's address.
     *
     * @param city - A String representing the city line of the member's
     * address.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Accessor method to retrieve the post code of the member's address.
     *
     * @return - A String representing the post code of the member's address.
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Accessor method to set the post code of the member's address.
     *
     * @param postcode - A String representing the post code of the member's
     * address.
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Accessor method to retrieve the telephone number of the member
     *
     * @return - A String representing the telephone number of the member.
     */
    public String getContact_number() {
        return contact_number;
    }

    /**
     * Accessor method to set the telephone number of the member
     *
     * @param contact_number - A String representing the telephone number of the
     * member.
     */
    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    /**
     * Accessor method to retrieve the email address of the member.
     *
     * @return - A String representing the email address of the member.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Accessor method to set the email address of the member.
     *
     * @param email - A String representing the email address of the member.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Accessor method to retrieve whether the member is active or not.
     *
     * @return - A String representing whether the member is active or not.
     */
    public String getIs_active() {
        return is_active;
    }

    /**
     * Accessor method to set whether the member is active or not.
     *
     * @param is_active - A String representing whether the member is active or
     * not.
     */
    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    /**
     * Accessor method to retrieve the password of the member. Always hashed
     * unless registering.
     *
     * @return - A String representing the password of the member.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Accessor method to set the password of the member. Always hashed unless
     * registering.
     *
     * @param password - A String representing the password of the member.
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
