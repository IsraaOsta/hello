package testt;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import israa.add;

public class testadd {
static add a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 a = new add();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void testAdd() {
		int z = 7;
		assertEquals(z, a.add1(2,5));
		
	}

	@Test
	public void testMain() {
		
		int b =-5;
		assertEquals(b, a.add1(-2,-3));

		
	}
	@Test
	public void test3() {
		
		int b =-1;
		assertEquals(b, a.add1(-2,1));

		
	}
	@Test
	public void test4() {
		
		int b =1;
		assertEquals(b, a.add1(2,-1));

		
	}
	@Test
	public void test5() {
		
		int b =-2;
		assertEquals(b, a.add1(-2,0));

		
	}
public void test6() {
		
		int b =2;
		assertEquals(b, a.add1(2,0));

		
	}

}
