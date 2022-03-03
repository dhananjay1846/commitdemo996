package com.progs;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTester {

	@Test
	public void test1() {
		//fail("Not yet implemented");
		try{
		Program1 pro=new Program1();
		int res=pro.Solution("app123");
		assertEquals(6,res);
		}
		catch(BugException e)
		{
			fail();
		}
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		try{
		Program1 pro=new Program1();
		int res=pro.Solution("a1b2");
		assertEquals(3,res);}
		catch(BugException e)
		{
			fail();
		}
	}
	
	@Test
	public void test3() {
		//fail("Not yet implemented");
		try{
		Program1 pro=new Program1();
		int res=pro.Solution("alvin0");
		assertEquals(0,res);}
		catch(BugException e)
		{
			fail();
		}
	}
	
	@Test
	public void test4() {
		//fail("Not yet implemented");
		try
		{
		Program1 pro=new Program1();
		int res=pro.Solution("a#n90");
		}
		catch(BugException e)
		{
		assertEquals("Invalid Character",e.getMessage());
		}
	}
   
	@Test
	public void test5() {
		//fail("Not yet implemented");
		try
		{
		Program1 pro=new Program1();
		int res=pro.Solution("a@#1");
		}
		catch(BugException e)
		{
		assertEquals("Invalid Character",e.getMessage());
		}
	}

}
