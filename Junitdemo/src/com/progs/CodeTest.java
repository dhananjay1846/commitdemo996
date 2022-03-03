package com.progs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CodeTest {

	@Test
	public void Test1()
	{
		int res=new Code1().divide(10,5);
		assertEquals(2,res);
	}
	
	@Test
	public void Test2()
	{
		int res=new Code1().divide(2,2);
		assertEquals(1,res);
	}
	
	@Test
	public void Test3()
	{
		try
		{
		int res=new Code1().divide(2,0);
		assertEquals(-1,res);
		}
		catch(Exception e)
		{
			fail();
		}
	}

}
