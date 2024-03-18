package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations  
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
		
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}

	@Test 
	public void TestA()
	{
		System.out.println("test A");
	}


	@Test
	public void TestB()
	{
		System.out.println("test B");
	}
	
	@Test
	public void TestC()
	{
		System.out.println("test C");
	}

	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method");
	}

	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
		
	}

}
