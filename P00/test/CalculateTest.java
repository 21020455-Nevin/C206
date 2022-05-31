import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21020455 (Nevin), May 31, 2022 11:07:44 AM
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * User, May 31, 2022 11:07:44 AM
 */

public class CalculateTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
		
		System.out.println("Test for Add");
		int expected = 5555;
		assertEquals (expected, actual);
		}

	public void testSubtract() {
		int a = 1234;
		int b = 234;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b); 
		
		System.out.println("Test for Subtract");
		int expected = 1000;
		assertEquals (expected, actual);
	}
	
	public void testMultiple() {
		int a = 12;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
		
		System.out.println("Test for Multiplication");
		int expected = 24;
		assertEquals (expected, actual);
	}
	
	public void testDivision() {
		int a = 12;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.division(a, b); 
		
		System.out.println("Test for Division");
		int expected = 6;
		assertEquals (expected, actual);
	}
	
}
