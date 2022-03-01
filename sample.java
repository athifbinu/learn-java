import java.util.Scanner;

/**
 * sample
 */
public class sample {
    public static void main(String[] args) {
    
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num<0){
            System.out.println("Result is possive number");
        }
        else{
            System.out.println("Result is negetive number");
        }
        
    }

    
}