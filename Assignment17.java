import java.util.Scanner;


/**
 * Assignment17
 */
public class Assignment17 {

    public static void main(String[] args) {
        System.out.println("Enter a limit");
        Scanner star=new Scanner(System.in); 
        int i,j;
        int num=star.nextInt();
        for(i=0;i<=num;i++){
            for(j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
        
    }
}
