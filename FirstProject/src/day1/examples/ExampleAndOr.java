package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
	  int x ,y;
	  x = 10;
	  y = -10;
	  
	  if( x >0 &&  y > 0) {
		  System.out.println("both are positive numbers");
	  }
	  else if(  x > 0 || y >0) {
		  System.out.println(" atleast one num is positive");
	  } else {
		  System.out.println("both the nums are negative");
	  }

	}

}
