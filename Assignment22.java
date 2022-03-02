

    import java.util.Scanner;

/**
 * Assignment22
 */
public class Assignment22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Array1[][] = new int[30][30];
		int Array2[][] = new int[30][30];
		int ResultArray[][] = new int[60][60];
		
		System.out.print("Enter size of array  :  ");
		int Size = scan.nextInt();
		
		System.out.println("\n\nEnter values of array 1  :  ");
		Array1 = getArray(Size,scan);
		
		
		System.out.println("\nEnter values of array 2  :  ");
		Array2 = getArray(Size,scan);
		
		ResultArray = addArray(Size,Array1,Array2);
		
		System.out.println("\n\nResult of Array1 + Array2");
		displayArray(Size, ResultArray);
		
	}
	
	private static void displayArray(int Size, int[][] ResultArray) {
		for(int i = 0; i < Size; i ++) {
			for(int j = 0; j < Size; j ++) {
                System.out.print(ResultArray[i][j] +" ");
			}
			System.out.println();
		}
	}

	public static int[][] getArray(int Size, Scanner scan){
		int Array[][] = new int[30][30];
		for(int i = 0; i < Size; i ++) {
			for(int j = 0; j < Size; j ++) {
				Array[i][j] = scan.nextInt();
			}
		}
	
		return Array;
	}
	
	public static int[][] addArray(int Size,int[][] Array1, int[][] Array2){
		int ResultArray[][] = new int[60][60]; 
		for(int i = 0; i < Size; i ++) {
			for(int j = 0; j < Size; j ++) {
				ResultArray[i][j] =  Array1[i][j] + Array2[i][j];
			}
		}
		return ResultArray;
	}

}

