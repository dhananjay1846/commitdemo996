package com.progs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test class started");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Test class finished");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Text method started");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Text method finished");
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
		assertEquals(true,true);
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		assertEquals(true,true);
	}

}
