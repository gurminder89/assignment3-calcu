package it.A3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcuimplementationtest extends TestCase {
	
	calcuimplementation Obj;
	int a ,b;

	protected void setUp() throws Exception {
		Obj = new calcuimplementation();
		a = 3;
		b = 5;
		calcinterface mockObj = mock (calcinterface.class);
		when (mockObj.add(a, b )).thenReturn(a+b);
		Obj.setCalc(mockObj);
	}

	protected void tearDown1() throws Exception {
		assertEquals(8, Obj.addTwoNums(a ,b));
	}
	
	protected void tearDown() throws Exception{
		Obj = null;
		a =0;
		b = 0;
	}

}
