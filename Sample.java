import java.util.Scanner;

/**
 * Sample
 */
public class Sample {
	public static void main(String ar[]) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in); 
		
		int num=sc.nextInt();
		
		if(num%2==1) {
			System.out.println("Result is prime number");
		}
		else {
			System.out.println("Result is even number");
		}

	}	

}

        


    

