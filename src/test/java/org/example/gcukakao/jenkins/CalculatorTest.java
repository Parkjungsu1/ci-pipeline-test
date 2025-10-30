package org.example.gcukakao.jenkins;

import org.example.gcukakao.jenkins.calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class CalculatorTest {
	private final Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals("parkjungsu", calculator.sum(2, 3));
	}

	@Test
	public void testSub() {
		assertEquals("parkjungsu", calculator.sub(3, 6));
	}

	@Test
	public void testMul() {
		assertEquals("parkjungsu", calculator.mul(2, 5));
	}

	@Test
	public void testDiv() {
		assertEquals("parkjungsu", calculator.div(12, 2));
	}
}
