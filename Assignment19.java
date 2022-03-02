import java.util.Scanner;
     /**
      * Assignment19
      */
     public class Assignment19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double Tax = 0;
		
		System.out.print("Enter the annual income :  ");
		double AnnualIncome = scan.nextInt();
		
		if(AnnualIncome >= 0 && AnnualIncome <= 250000) {
			Tax = 0;
		}else if(AnnualIncome > 250000 && AnnualIncome <= 500000) {
			Tax = FindPercentage(AnnualIncome, 5);
		}else if(AnnualIncome > 500000 && AnnualIncome <= 1000000) {
			Tax = FindPercentage(AnnualIncome, 20);
		}else if(AnnualIncome > 1000000 && AnnualIncome <= 5000000) {
			Tax = FindPercentage(AnnualIncome, 30);
		}else {
			Tax = -1;
		}
		
		if(Tax == 0) {
			System.out.print("\nYou don't have to pay tax");
		}else if(Tax == -1) {
			System.out.print("\nEnter income between 50 lakh and 0");
		}else {
			System.out.print("\nIncome Tax amount : " + Tax);
		}
		
	}
	
	static double FindPercentage(double AnnualIncome, double HowMuch) {
		double percentage = (AnnualIncome * HowMuch)/100;
		return percentage;
	}

}

