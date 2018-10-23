package com.codebind;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.junit.Test;

public class studentTest {

	@Test
	public void test() {
		DateTime time = new DateTime();
		student test = new student("michael", 21, time, 12345678);
		String result = test.getUsername();
		System.out.println(result);
		assertEquals("michael21", result);
	}

}
