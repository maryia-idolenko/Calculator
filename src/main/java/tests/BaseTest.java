package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BEFORE SUITE BASE");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BEFORE GROUPS BASE");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BEFORE TEST BASE");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BEFORE CLASS BASE");
    }

    @BeforeClass
    public void beforeMethod() {
        System.out.println("BEFORE METHOD BASE");
    }
}