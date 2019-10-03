package jUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Asserttest {

	@Test
	public void test() {
		
		boolean t=true;
		int i=1;
		
		assertEquals(1,1);//checks equal or not.
		assertTrue(t);//checks conditions.gives red bar when condition is false.
		assertFalse(t);//checks conditions.gives red bar when condition is true.
		assertNotNull(i);//gives red bar for null object.
		assertNull(i);//gives red bar when a object is not null.
		//assertArrayEquals(expected,actuals);...checks if arrays are equal
		assertNotEquals(1,2);//checks if not equal.this code is not used anymore nowadays.
	}
}
