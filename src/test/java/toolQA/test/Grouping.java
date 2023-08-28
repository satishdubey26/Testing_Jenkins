package toolQA.test;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"Car"})
	public void fuction1() {
		
		System.out.println("Hello world");
	}
	
	@Test(groups={"Motor"} )
	public void fuction2() {
		
		System.out.println("Hello univers");
	}

	@Test(groups={"Bike"} )
	public void fuction3() {
	
	System.out.println("Hello ocean");
	}

	@Test(groups={"Car"} )
	public void fuction4() {
	
	System.out.println("Hello sky");
	}

}
