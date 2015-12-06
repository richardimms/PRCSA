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
public class ItemTypeListTest {
    ItemTypeList itl = new ItemTypeList();
    ItemType it1;
    ItemType it2;
    
    /**
     *
     */
    public ItemTypeListTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        it1 = new ItemType(0,"request");
        it2 = new ItemType(1,"service");
        
        itl.addItemType(it1);
        itl.addItemType(it2);
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
    public void testAddItemType() {
        ItemType it3 = new ItemType();
        itl.addItemType(it3);
        int expected = 3;
        assertEquals("The amount of item types does not match the expected amount",expected,itl.amountOfItemTypes());
    }

    /**
     *
     */
    @Test
    public void testGetItemTypeAt() {
        ItemType expected = it1;
        ItemType result = itl.getItemTypeAt(0);
        assertEquals("The itemType at the specified index does not match",expected,result);
    }
}
