
    import java.util.Scanner;

/**
 * Assignment21
 */
public class Assignment21 {

	public static void main(String[] args) {
		
		int Array[] = new int[30];
		int Result[] = new int[30];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size of array  :  ");
		int Size = scan.nextInt();
		
		System.out.println("Enter array values  :  ");
		for(int i = 0; i < Size; i ++) {
			Array[i] = scan.nextInt();
		}
		for(int i = 0; i < Size - 1; i ++) {
			Result[i] = Array[i]*Array[i + 1];
		}
		
		System.out.print("\n\nResult array : ");
		for(int i = 0; i < Size - 1; i ++) {
			System.out.print(" " + Result[i]);
		}
	}

}
    

