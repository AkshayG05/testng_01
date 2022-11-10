package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

	//public static void main(String[] args) { this is java compiler )
		// TODO Auto-generated method stub

	@Test(groups=("Smoke"))  // gives more details to testng to run the code add testng lib and then import testng lib by placing the mouse @Testanotation
	public void demo1() { //still not run as outside of the public main class above testng not consider this 
	
	System.out.println("Hello"); // demo is method name and its showing detailed report pass / fail in the result.
	}
	@BeforeTest
	
	public void demo2() {
		
		System.out.println("Java");
	}
	
@Test(enabled=false) //not execute  
	
	public void demom() {
		
		System.out.println("Java, c, python");
	}


@Test(enabled=true) //exceute

public void demome() {
	
	System.out.println("programming world");
}

@Test(timeOut=40000) //exceute

public void demomer() {
	
	System.out.println("out of the box");
}


@Parameters({"URL"})
    @Test
    public void friend(String urlname) {
	
	System.out.println("out of the box");
	System.out.println(urlname);
	//System.out.println(key);
}
	}


