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
public class CategoryListTest {
    CategoryList catList = new CategoryList();
    Category cat1;
    Category cat2;
    
    /**
     *
     */
    public CategoryListTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        cat1 = new Category(0,"Cleaning");
        cat2 = new Category(1,"Electronics");
        
        catList.addCatType(cat1);
        catList.addCatType(cat2);
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
    public void testAddCatType() {
        Category cat3 = new Category();
        catList.addCatType(cat3);
        int expected = 3;
        assertEquals("",expected,catList.amountOfCategories());
    }

    /**
     *
     */
    @Test
    public void testGetCategoryAt() {
        Category expected = cat2;
        Category result = this.catList.getCategoryAt(1);
        assertEquals("The category retrieved does not match the result",expected,result);
    }

    /**
     *
     */
    @Test
    public void testAmountOfCategories() {
        int expected = 2;
        int result = this.catList.amountOfCategories();
        assertEquals("",expected,result);
    }    
}
