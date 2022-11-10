package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	@Parameters({"URL"})
	@AfterTest
	
	public void mamos5() {
		
		System.out.println("web testing after this is after test so this will at the end ");
		
		
	}
	
	
	@BeforeClass
	public void demos() {
		
		System.out.println("before executing any methods in the class this is BeforeClass so execute before ");
	}
	
	
	@AfterSuite
	public void momos11() {
		
		
		System.out.println("Application after suite shows at the last of all the methods executed");
	}
	
	@AfterClass
	public void demos2() {
		
		System.out.println("After executing all methods in the class this is after class ");
	}
	@BeforeMethod
	
	public void main8() {
		
		System.out.println("application method before all this is before method");
	}
	
	
	
	@BeforeTest
	public void momos6() {
		
		System.out.println("Api testing before test this is before test ");
		
		
		
	}
	
	@BeforeSuite
	public void momos9() {
		
		
		System.out.println(" before Application suite shows this is before suite");
	}
	
	@Test(groups=("Smoke"))
	public void momos7() {
		
		
		System.out.println("momosAppium testing only test");
		
		
	}

	
	@AfterMethod
	public void momos10() {
		System.out.println("after suite imp this is after method at the last showing");
		
		
		
		
		
		
	}
	

	}
	
	

