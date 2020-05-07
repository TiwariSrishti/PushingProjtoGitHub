package PrintingHelloWorld;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PrintHello {
	
	@BeforeClass
	public void beforemethod()
	{
		System.out.println("This is before method");
	}
	
	@Test
	public void testmethod()
	{
		System.out.println("This is test method");
	}
	
	@AfterClass
	public void aftermethod()
	{
		System.out.println("This is after method");
	}

}
