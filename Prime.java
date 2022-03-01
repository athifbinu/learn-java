import java.util.Scanner;



/**
 * Prime
 */
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==2){
            System.out.println("Answer is Even number");
        }
        else{
            System.out.println("Result is Prime Number");
        }

        
    }

    
}