package com.progs;

class BugException extends Exception
{
	public BugException(String message)
	{
		super(message);
	}
}

public class Program1 {
	
	public int Solution(String input) throws BugException
	{
		
		char[] c=input.toCharArray();
		int sum=0;
		
		for(char b : input.toCharArray())
		{
			if(Character.isDigit(b))
			{
				int a=Integer.parseInt(String.valueOf(b));
				sum=sum+a;
			}
			else if(!(Character.isLetterOrDigit(b)))
			{
				throw new BugException("Invalid Character");
			}
		}
		
		
		return sum;
	}

}
