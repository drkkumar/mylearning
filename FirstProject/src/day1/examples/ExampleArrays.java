package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		
     int[] a = {10,20,30,40,50};
    System.out.println(a[2] +" " +a[4]);
    //enhanced for
    for(int temp : a){
    	System.out.println(temp);
    }
     int[] x = new int[5];
     x[0] = 12;
     x[3] = 25;
     for(int temp2 : x) {
    	 System.out.println(temp2);  
     }
     String[] st={"one","two","three"};
     for(String temp : st ) {
    	 System.out.println(temp);
    	 
     }
     String[]  stx = new String[5];
     stx[3] = "12";
     stx[0] = "25";
     for(String temp2 : stx) {
    	 System.out.println(temp2);
     
     }
     
	}

}
