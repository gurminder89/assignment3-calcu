package it.A3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcuimplementationTest5 extends TestCase {
	
	calcuimplementation obj;
	double a, b;

	protected void setUp() throws Exception {
		
		obj = new calcuimplementation();
		a = 3;
		b = 5;
		calcinterface mockObj = mock (calcinterface.class);
		when (mockObj.divide(a,b )).thenReturn  (((double) a/ (double)b));
		obj.setCalc(mockObj);
		
		
	}



	public void testDivideTwoNums() {
		assertEquals(0.6, a/b);
	}
		
		protected void tearDown() throws Exception {
			
			obj = null;
			a =0;
			b = 0;
		
	}

}
