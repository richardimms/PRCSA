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
public class AdvertTypeListTest {

    private AdvertTypeList adTypeList = new AdvertTypeList();
    private AdvertType adTyp1;
    private AdvertType adTyp2;

    /**
     *
     */
    public AdvertTypeListTest() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
        adTyp1 = new AdvertType(0,"Service");
        adTyp2 = new AdvertType(1,"Offer");
        
        adTypeList.addAdvertType(adTyp1);
        adTypeList.addAdvertType(adTyp2);

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
    public void testAddAdvertType() {
        System.out.println("addAdvertType");
        AdvertType adType3 = new AdvertType();
        this.adTypeList.addAdvertType(adType3);
        int expResult = 3;
        int result = this.adTypeList.allAdvertTypes();
        assertEquals("Added an advertType but the number of advertTypes is different to the value expected", expResult, result);
    }

    /**
     *
     */
    @Test
    public void testGetAdvertTypeAt() {
        System.out.println("getAdvertType");
        AdvertType expected = adTyp1;
        AdvertType result = this.adTypeList.getAdvertTypeAt(0);
        assertEquals("",expected,result);
    }
}
