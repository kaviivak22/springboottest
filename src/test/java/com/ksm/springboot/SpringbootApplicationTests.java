package com.ksm.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringbootApplicationTests {

	@Test
	public void postiveTestAdd(){
		int result = 3 + 3;
		assertTrue(result == 6);
	}

	@Test
	public void negativeTestAdd(){
		int result = 3 + 3;
		assertFalse(result == 8);
		//assertTrue(result == 8);
	}

	@Test
	public void postiveTestSub(){
		int result = 9 - 3;
		assertTrue(result == 6);
	}
}
