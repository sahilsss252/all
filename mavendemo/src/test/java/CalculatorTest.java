

import static org.junit.Assert.*;

import org.junit.Test;

import mavendemo.Calculator;

public class CalculatorTest {

	@Test
	public void testIfAdditionWorkingorNot() {
		Calculator c=new Calculator();
		int result =c.add(10, 30);
		int expected=40;
		assertEquals(expected,result);
	}
	
	@Test
	public void testIfSubtractionWorkingorNot() {
		Calculator c=new Calculator();
		int result =c.sub(10, 30);
		int expected=-20;
		assertEquals(expected,result);
	}

}
