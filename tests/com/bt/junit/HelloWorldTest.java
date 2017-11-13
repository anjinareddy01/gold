package com.bt.junit;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.bt.general.HelloWorld;


public class HelloWorldTest {
	
	HelloWorld helloWorld = new HelloWorld();
	
	@Test()
		public void timestampTest(){
	    Date localCurrentDate = HelloWorld.getLocalCurrentDate();
		Assert.assertEquals(localCurrentDate, localCurrentDate);  ;
	}

}