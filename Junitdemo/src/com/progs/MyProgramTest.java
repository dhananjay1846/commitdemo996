package com.progs;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyProgramTest {

	@Test
	   public void testFindSum1() {
		MyProgram prog=new MyProgram();
		int actual=prog.findsum(10,5);
		assertEquals(15, actual);
	}
	
	@Test
	public void testFindSum2() {
		MyProgram prog=new MyProgram();
		int actual=prog.findsum(-2,2);
		assertEquals(0, actual);
	}

}
