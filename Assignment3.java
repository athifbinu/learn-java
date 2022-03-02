import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter principal amount : ");
		int P = scan.nextInt();
		System.out.print("Enter Interest Rate (%)  :  ");
		float R = scan.nextFloat();
		System.out.print("Enter number of years  :   ");
		float n = scan.nextFloat();
		float SI = (P*R*n)/100;
		System.out.print("Simple Interest :  " + SI);
	}
}
    
