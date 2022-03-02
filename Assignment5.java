import java.util.Scanner;

/**
 * Assignment5
 */
public class Assignment5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your total mark percentage :   ");
		float TotalMark = scan.nextFloat();
		if(TotalMark >= 90 && TotalMark <= 100) {
			System.out.print("Your Grade :  A");
		}else if(TotalMark >= 80 && TotalMark < 90) {
			System.out.print("Your Grade :  B");
		}else if(TotalMark >= 70 && TotalMark < 80) {
			System.out.print("Your Grade :  C");
		}else if(TotalMark >= 60 && TotalMark < 70) {
			System.out.print("Your Grade :  D");
		}else if(TotalMark >= 50 && TotalMark < 60) {
			System.out.print("Your Grade :  E");
		}else if(TotalMark < 50 && TotalMark >= 0) {
			System.out.print("Failed");
		}else {
			System.out.print("Only number between 0 and 100 is allowed");
		}	
	}	
}

