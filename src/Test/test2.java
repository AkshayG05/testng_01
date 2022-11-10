package Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

	@Test  // gives more details to testng to run the code add testng lib and then import testng lib by placing the mouse @Testanotation
	public void demo3() { //still not run as outside of the public main class above testng not consider this 
	
	System.out.println("Best Time "); // demo is method name and its showing detailed report pass / fail in the result.
	}
	
	@Parameters({"URL"})
	@BeforeTest
	
	public void demo4() {
		
		System.out.println("Welcome to the world of testng");
	}
	
	}

