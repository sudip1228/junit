package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class mymathtest {
	Mymath mymath= new Mymath();
	
	@Before//here it doesnot work dont know why?.@Before executes each time before the @test.
	public void before() {
		System.out.println("before");
	}
	@After
	public void after() {//runs after each test.
		System.out.println("after");
	}
	@BeforeClass
	public static void beforeclass() {//method should be static for using @before and @after
		System.out.println("before class");//runs once before starting the test.
	}
	@AfterClass
	public static void afterclass() {//runs after every test.
		System.out.println("after class");//runs once at the end of the test.
	}
	
	
	@Test//it means it contains unit test.unit test means testing each method of a class.junit is a framework to do unit testing.
	public void sumwith3numbers () {
		//principal of junit is absence of failure is success.
		System.out.println("test 1");
		assertEquals(6,mymath.sum(new int [] {1,2,3}));
			}

	@Test//it means it contains unit test.unit test means testing each method of a class.junit is a framework to do unit testing.
	public void sumwith1numbers () {
		//principal of junit is absence of failure is success.
		System.out.println("test 2");
		assertEquals(3,mymath.sum(new int [] {3}));
		
	}

}
