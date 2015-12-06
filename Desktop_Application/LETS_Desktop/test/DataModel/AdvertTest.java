/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

import ObserverPattern.IObserver;
import java.sql.Blob;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import testingsupportclasses.ConcreteObserver;

/**
 *
 * @author Richard
 */
public class AdvertTest {

    private Advert advert;

    /**
     *
     */
    public AdvertTest() {

    }

    /**
     *
     */
    @Before
    public void setUp() {
        java.sql.Date createdDate = new java.sql.Date(1 / 2 / 2015);
        java.sql.Date completedDate = new java.sql.Date(2 / 2 / 2015);
        java.sql.Date expiryDate = new java.sql.Date(4 / 2 / 2015);
        Blob blob = null;
        advert = new Advert(1, 2, 1, 2, 1, "Washing", "Cleaning clothes", createdDate, expiryDate, 3, "Y", completedDate, blob, "Y");
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     *
     */
    @Test
    public void testGetMemberID() {
        int expResult = 1;
        int result = advert.getMemberID();
        assertEquals("Member ID of the address does not match the expected result", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetMemberID() {
        int memberID = 2;
        advert.setMemberID(memberID);
        assertEquals("Line 1 of the address was not SET correctly", memberID, advert.getMemberID());
    }

    /**
     *
     */
    @Test
    public void testGetAdvertNo() {
        int expectedResult = 1;
        int result = advert.getAdvertNo();
        assertEquals("Advert ID does not match the expected result",expectedResult,result);
    }

    /**
     *
     */
    @Test
    public void testSetAdvertNo() {
        int advertNumber = 1;
        advert.setAdvertNo(advertNumber);
        assertEquals("Advert ID not SET correctly", advertNumber, advert.getAdvertNo());
    }

    /**
     *
     */
    @Test
    public void testGetAdTitle() {
        String expectedResult = "Washing";
        String result = advert.getAdTitle();
        assertEquals("Advert title does not match the expected results", expectedResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetAdTitle() {
         String advertTitle = "Cleaning";
         advert.setAdTitle(advertTitle);
         assertEquals("Advert title not SET correctly", advertTitle, advert.getAdTitle());
    }

    /**
     *
     */
    @Test
    public void testGetAdDescription() {
        String expected = "Cleaning clothes";
        String result = advert.getAdDescription();
        assertEquals("Advert description does not equal what was expected", result, expected);
    }

    /**
     *
     */
    @Test
    public void testSetAdDescription() {
        String advertDescription = "Washing a number of clothes";
        advert.setAdDescription(advertDescription);
        assertEquals("Advert description is not SET correctly", advertDescription, advert.getAdDescription());
    }

    /**
     *
     */
    @Test
    public void testGetAdPosted() {
       java.sql.Date expected = new java.sql.Date(1 / 2 / 2015);
       java.sql.Date result = advert.getAdPosted();
       assertEquals("Date the advert was posted does not match what was expected", expected, result);
    }

    /**
     *
     */
    @Test
    public void testSetAdPosted() {
        java.sql.Date datePosted = new java.sql.Date(1/03/2015);
        advert.setAdPosted(datePosted);
        assertEquals("Posted date not SET correctly",datePosted,advert.getAdPosted());     
    }

    /**
     *
     */
    @Test
    public void testGetAdExpires() {
       java.sql.Date expected = new java.sql.Date(4 / 2 / 2015);
       java.sql.Date result = advert.getAdExpires();
       assertEquals("Date the advert expires does not match what was expected", expected, result);
    }

    /**
     *
     */
    @Test
    public void testSetAdExpires() {
        java.sql.Date dateExpires = new java.sql.Date(5/2/2015);
        advert.setAdExpires(dateExpires);
        assertEquals("Expired date not SET correctly",dateExpires,advert.getAdPosted());   
    }

    /**
     *
     */
    @Test
    public void testGetAdCost() {
       int expected = 3;
       int result = advert.getAdCost();
       assertEquals("Advert cost does not match the cost of the advert",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetAdCost() {
        int advertCost = 1;
        advert.setAdCost(advertCost);
        assertEquals("advert cost does not SET correctly",advertCost, advert.getAdCost());
    }

    /**
     *
     */
    @Test
    public void testGetTransportInc() {
        String expected = "Y";
        String result = advert.getTransportInc();
        assertEquals("",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetTransportInc() {
        String transport = "N";
        advert.setTransportInc(transport);
        assertEquals("",transport,advert.getTransportInc());
    }

    /**
     *
     */
    @Test
    public void testGetAdCompleted() {
       java.sql.Date expected = new java.sql.Date(2 / 2 / 2015);
       java.sql.Date result = advert.getAdCompleted();
       assertEquals("Date the advert completed does not match what was expected", expected, result);
    }

    /**
     *
     */
    @Test
    public void testSetAdCompleted() {
        java.sql.Date adCompleted = new java.sql.Date(5/2/2015);
        advert.setAdExpires(adCompleted);
        assertEquals("Completed date not SET correctly",adCompleted,advert.getAdCompleted());  
    }

    /**
     *
     */
    @Test
    public void testGetCatID() {
        int expected = 2;
        int result = advert.getCatID();
        assertEquals("",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetCatID() {
        int catID = 1;
        advert.setCatID(catID);
        assertEquals("",catID,advert.getCatID());
    }

    /**
     *
     */
    @Test
    public void testGetAdTypeID() {
        int expected = 2;
        int result = advert.getAdTypeID();
        assertEquals("",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetAdTypeID() {
        int adTypeID = 1;
        advert.setAdTypeID(adTypeID);
        assertEquals("",adTypeID,advert.getAdTypeID());
    }

    /**
     *
     */
    @Test
    public void testGetItemTypeID() {
        int expected = 1;
        int result = advert.getItemTypeID();
        assertEquals("",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetItemTypeID() {
        int itemTypeID = 2;
        advert.setItemTypeID(itemTypeID);
        assertEquals("",itemTypeID,advert.getItemTypeID());
    }

    /**
     *
     */
    @Test
    public void testGetIsActive() {
       String expected = "Y";
       String result = advert.getIsActive();
       assertEquals("",expected,result);
       
    }

    /**
     *
     */
    @Test
    public void testSetIsActive() {
          String isActive = "N";
          advert.setIsActive(isActive);
          assertEquals("",isActive,advert.getIsActive());
    }

    /**
     *
     */
    @Test
    public void testRegisterObserver() {
        IObserver o = new ConcreteObserver();
        Boolean expResult = true;
        Boolean result = advert.registerObserver(o);
        assertEquals("Failed to register an observer with the address object", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testRemoveObserver() {
        IObserver o = new ConcreteObserver();
        advert.registerObserver(o);
        Boolean expResult = true;
        Boolean result = advert.removeObserver(o);
        assertEquals("Could not remove an observer from the test class", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testNotifyObservers() {
        ConcreteObserver o = new ConcreteObserver();
        advert.registerObserver(o);
        advert.notifyObservers();
        int expResult = 1;
        int result = o.getCount();
        assertEquals("One call to notify observers should produce 1 update NOT " + result + " updates", expResult, result);
    }
}
