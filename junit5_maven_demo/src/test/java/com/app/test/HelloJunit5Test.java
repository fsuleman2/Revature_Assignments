package com.app.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJunit5Test {

	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("Hello from @BeforeAll - I will be executed only once before anything in this class");
	}

	@BeforeEach
	public void helloBeforeEach() {
		System.out.println("Hello from @BeforeEach -  I will be executed before any test case of this class");
	}

	@Test
	public void test1() {
		System.out.println("Hello from @Test from the method test1()");
	}

	@Test
	public void test2() {
		System.out.println("Hello from @Test from the method test2()");
	}

	@Test
	public void test3() {
		System.out.println("Hello from @Test from the method test3()");
		//fail("I am failing wantedly");
	}

	@AfterEach
	public void helloAfterEach() {
		System.out.println("Hello from @AfterEach -  I will be executed after any test case of this class");
	}

	@AfterAll
	public static void helloAfterAll() {
		System.out.println(
				"Hello from @AfterAll - I will be executed after everything is done from this class even after object destruction");
	}
}
