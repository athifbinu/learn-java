import java.util.Scanner;

/**
 * Assignment13
 */
public class Assignment13 {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String reverse = "";
		
		System.out.print("Enter a String  :   ");
		String text = scan.next();
		
		
		for(int i = text.length() - 1; i >= 0; i --) {
			reverse = reverse + text.charAt(i);
		}
		
		if(reverse.toLowerCase().equals(text.toLowerCase())) {
			System.out.println("Entered string is palindrome");
		}else {
			System.out.println("Entered string is not palindrome");
		}
	}

}

    
