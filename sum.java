import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        
        System.out.println("1 for chicken\n2 for beef\n3 for bus");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch(num) {
            case 1:
            System.out.println("You were selected chicken");
            break;

            case 2:
            System.out.println("You were selected beef");
            break;
            case 3:
            System.out.println("You were selected bus");
            break;
            default:
            System.out.println("You are selected invalid");
        }

        

        
    }
    
}
