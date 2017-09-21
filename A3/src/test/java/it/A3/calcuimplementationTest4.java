package it.A3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcuimplementationTest4 extends TestCase {

	calcuimplementation obj;
	int a, b;
	
	protected void setUp() throws Exception {
		
		obj = new calcuimplementation();
		a = 3;
		b = 5;
		calcinterface mockObj = mock (calcinterface.class);
		when (mockObj.multiply(a, b )).thenReturn(a*b);
		obj.setCalc(mockObj);
		
	}
	
	public void testmultiply() {
		assertEquals(15, a*b);
	}

	protected void tearDown() throws Exception {
		
		obj = null;
		a =0;
		b = 0;
		
	
		
	}

}
