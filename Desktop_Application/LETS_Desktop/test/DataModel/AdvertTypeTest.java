/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Richard
 */
public class AdvertTypeTest {
    
    AdvertType adType;

    /**
     *
     */
    public AdvertTypeTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        adType = new AdvertType(1,"Offer");
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
    public void testGetAdvertType_id() {
        int expected = 1;
        int result = adType.getAdvertType_id();
        assertEquals("advertType ID does not match the expected result",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetAdvertType_id() {
        int advertTypeID = 2;
        adType.setAdvertType_id(advertTypeID);
        assertEquals("adTypeID not SET correctly",advertTypeID, adType.getAdvertType_id());
    }

    /**
     *
     */
    @Test
    public void testGetAdvertType() {
        String expected = "Offer";
        String result = adType.getAdvertType();
        assertEquals("advert tupe does not match the expected result",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetAdvertType() {
        String advertType = "Service";
        adType.setAdvertType(advertType);
        assertEquals("",advertType,adType.getAdvertType());
    }
    
}
