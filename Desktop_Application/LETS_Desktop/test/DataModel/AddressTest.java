/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

import ObserverPattern.IObserver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import testingsupportclasses.ConcreteObserver;

/**
 *
 * @author Richard
 */
public class AddressTest {
     private Address testAddress;
     
    /**
     *
     */
    public AddressTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
      this.testAddress = new Address("20 Deptford Place", "North Hill", "Plymouth", "PL4 8JL");
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
    public void testGetAddress_1() {
        String expResult = "20 Deptford Place";
        String result = testAddress.getAddress_1();
        assertEquals("Line 1 of the address does not match expected result", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetAddress_1() {
        String addressLine1 = "21 Deptford Place";
        testAddress.setAddress_1(addressLine1);
        assertEquals("Line 1 of the address was not SET correctly", addressLine1, testAddress.getAddress_1());
    }

    /**
     *
     */
    @Test
    public void testGetAddress_2() {
         String expResult = "North Hill";
         String result = testAddress.getAddress_2();
         assertEquals("Line 2 of the address does not match the expected result", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testSetAddress_2() {
        System.out.println("setAddressLine2");
        String addressLine1 = "Beaumont";
        testAddress.setAddress_1(addressLine1);
        assertEquals("Line 1 of the address was not SET correctly", addressLine1, testAddress.getAddress_1());
    }

    /**
     *
     */
    @Test
    public void testGetCity() {
         String expectedResult = "Plymouth";
         String city = testAddress.getCity();
         assertEquals("The city of the address does not match the expected result", expectedResult, city);
    }

    /**
     *
     */
    @Test
    public void testSetCity() {
         String city = "Birmingham";
         testAddress.setCity(city);
         assertEquals("City was not SET correctly", city, testAddress.getCity());
    }

    /**
     *
     */
    @Test
    public void testGetPostcode() {
         String expectedResult = "PL4 8JL";
         String postcode = testAddress.getPostcode();
         assertEquals("The postcode of the address does not match the expected result", expectedResult, postcode);
    }

    /**
     *
     */
    @Test
    public void testSetPostcode() {
         String postcode = "ST8 7NX";
         testAddress.setPostcode(postcode);
         assertEquals("Postcode was not SET correctly", postcode, testAddress.getPostcode());
    }

    /**
     *
     */
    @Test
    public void testRegisterObserver() {
        IObserver o = new ConcreteObserver();
        Boolean expResult = true;
        Boolean result = testAddress.registerObserver(o);
        assertEquals("Failed to register an observer with the address object", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testRemoveObserver() {
        IObserver o = new ConcreteObserver();
        testAddress.registerObserver(o);
        Boolean expResult = true;
        Boolean result = testAddress.removeObserver(o);
        assertEquals("Could not remove an observer from the test class", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testNotifyObservers() {
        ConcreteObserver o = new ConcreteObserver();
        testAddress.registerObserver(o);
        testAddress.notifyObservers();
        int expResult = 1;
        int result = o.getCount();
        assertEquals("One call to notify observers should produce 1 update NOT " + result + " updates", expResult, result);
    }    
}
