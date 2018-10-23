package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class studentTest {

	@Test
	public void test() {
		student test = new student("michael", 21, "28041997", 12345678);
		String result = test.getUsername();
		System.out.println(result);
		assertEquals("michael21", result);
	}

}
