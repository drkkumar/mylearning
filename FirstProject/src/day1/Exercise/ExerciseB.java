package day1.Exercise;

public class ExerciseB {

	public static void main(String[] args) {
		String[] nums = {"10","20","30","40"};
		int total=0;
		for(String temp :nums){
			total +=Integer.parseInt(temp );
		}
		System.out.println("Total = " +total);

	}

}
