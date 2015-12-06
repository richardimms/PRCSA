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
public class AdvertListTest {
    AdvertList adList = new AdvertList();
    Advert advert1 = new Advert();
    Advert advert2 = new Advert();
    
    /**
     *
     */
    public AdvertListTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        //Create Two Adverts
        java.sql.Date createdDate = new java.sql.Date(3 / 2 / 2015);
        java.sql.Date completedDate = new java.sql.Date(21 / 1 / 2015);
        java.sql.Date expiryDate = new java.sql.Date(14 / 2 / 2015);
        
        java.sql.Date createdDate2 = new java.sql.Date(1 / 2 / 2015);
        java.sql.Date completedDate2 = new java.sql.Date(2 / 2 / 2015);
        java.sql.Date expiryDate2 = new java.sql.Date(4 / 2 / 2015);
        Blob blob = null;
  
         advert1= new Advert(2, 2, 2, 2, 2, "Washing", "Cleaning clothes", createdDate2, expiryDate, 2, "N", completedDate, blob, "Y");
         advert2 = new Advert(1, 2, 1, 2, 1, "Washing", "Cleaning clothes", createdDate, expiryDate2, 3, "Y", completedDate2, blob, "N");
        
        adList.addAdvert(advert1);
        adList.addAdvert(advert2);
                
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
    public void testAddAdvert() {
        Advert newAd = new Advert();
        this.adList.addAdvert(newAd);
        int expResult = 3;
        int result = this.adList.totalAmountOfAdverts();
        assertEquals("Added a advert but the number of adverts is different to the value expected", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testGetAdvertAt() {
        Advert expected = advert1;
        Advert result = this.adList.getAdvertAtIndex(0);
        assertEquals("getAdvertAt returned the wrong advert",expected,result);
    }

    /**
     *
     */
    @Test
    public void testGetIndexOfAdvert() {
        int expected = 0;
        int result = adList.getIndexOfAdvert(advert1);
        assertEquals("",expected,result);
    }

    /**
     *
     */
    @Test
    public void testAdvertSize() {
        int expected = 2;
        int result = this.adList.totalAmountOfAdverts();
        assertEquals("",expected,result);
    }

    /**
     *
     */
    @Test
    public void testGetAdvertById() {
        Advert expected = advert2;
        Advert result = this.adList.getAdvertById(1);
        assertEquals("",expected,result);
    }

    /**
     *
     */
    @Test
    public void testRegisterObserver() {
        IObserver o = new ConcreteObserver();
        Boolean expResult = true;
        Boolean result = adList.registerObserver(o);
        assertEquals("Failed to register an observer with the address object", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testRemoveObserver() {
        IObserver o = new ConcreteObserver();
        adList.registerObserver(o);
        Boolean expResult = true;
        Boolean result = adList.removeObserver(o);
        assertEquals("Could not remove an observer from the test class", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testNotifyObservers() {
        ConcreteObserver o = new ConcreteObserver();
        adList.registerObserver(o);
        adList.notifyObservers();
        int expResult = 1;
        int result = o.getCount();
        assertEquals("One call to notify observers should produce 1 update NOT " + result + " updates", expResult, result);
    }    
}
