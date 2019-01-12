package com.absolutns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.absolutns.controller.HomeController;

public class AppTest 
{
    @Test
	public void testApp(){
    	HomeController hc = new HomeController();
    	String result = hc.home();
    	assertEquals(result, "Das Boot, reporting for duty!");
     
    }
}
