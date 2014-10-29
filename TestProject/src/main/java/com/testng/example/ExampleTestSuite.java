package com.testng.example;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleTestSuite {

   private String var;
   
    @BeforeClass
    public void beforeClass() {       
        System.out.println("Before class");
    }
    
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }
    
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }
    
    @Test
    public void test() {
        System.out.println("Test");
    }
    
    @AfterClass
    public void afterClass() {       
        System.out.println("After class");
    }
    
    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }
    
    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }
    
    
    
}
