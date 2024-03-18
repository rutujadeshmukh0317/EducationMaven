package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionFailTestCase
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

	@Test (dependsOnMethods= {"TestB"}) //A depend on B 
	public void TestA() // it will skip
	{
		System.out.println("test A");
	
	}

	@Test
	public void TestB() // it will fail
	{
		System.out.println("test B");
		Assert.fail(); //fail B test case 
	}
	
	@Test  
	public void TestC() // it will pass
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
