package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	
@Before("@MobileTest")
public void before() {
	System.out.println("Hook before ");
}

@After("@MobileTest")
public void after() {
	System.out.println("Hook after mobile");
	System.out.println("");
	System.out.println("-----------------");
}
}
