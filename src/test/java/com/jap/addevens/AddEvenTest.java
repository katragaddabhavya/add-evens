package com.jap.addevens;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.jap.addeven.AddEven;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddEvenTest
{
    AddEvenTest addEven = null;
    @Before
    public void setUp(){
        addEven = new AddEvenTest();
    }
    @After
    public void tearDown(){
        addEven = null;
    }
@Test
    public void givenAnIntegerAddEvenNumbersTillTheIntegerReturnSumOfEvensSuccess(){
        assertEquals(20,addEven.addEven(9));
        assertEquals(110,addEven.addEven(20));
        assertEquals(650,addEven.addEven(50));
    }
    @Test
    public void givenAnIntegerAddEvenNumbersTillTheIntegerReturnSumOfEvensFailure(){
        assertEquals(0,addEven.addEven(-9));
        assertEquals(0,addEven.addEven(-20));
        assertEquals(0,addEven.addEven(0));
    }
}
