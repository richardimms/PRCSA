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
public class CategoryTest {
    Category cat1;

    /**
     *
     */
    public CategoryTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        cat1 = new Category(0,"Washing");
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
    public void testGetCategory_id() {
        int expected = 0;
        int result = cat1.getCategory_id();
        assertEquals("the category ID does not match the expected",expected,result);
    }

    /**
     *
     */
    @Test
    public void testSetCategory_id() {
        int catID = 1;
        cat1.setCategory_id(catID);
        assertEquals("category id did not SET correctly",catID,cat1.getCategory_id());
    }
}
