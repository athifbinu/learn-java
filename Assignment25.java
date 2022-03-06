import java.util.Scanner;

/**
 * Assignment25
 */
public class Assignment25 {

	public static void main(String[] args) {
	
   
 
       Scanner scan=new Scanner(System.in);
 
       System.out.print("Enter array size : ");
       int array_size = scan.nextInt();
 
       int[] array = new int[array_size];
 
       for (int i = 0; i < array_size; i++)
           array[i] = scan.nextInt();
 
       for (int i = 0; i < array_size; i++)
           if (array[i] % 2 == 1) {
               for (int j = i + 1; j < array_size - 2; j++)
                   array[j] = array[j + 2];
               if (i + 2 < array_size)
                   array_size -= 2;
               else
                   array_size -= (array_size - i - 1);
           }
 
       System.out.println("\nResult array :  ");
       for (int i = 0; i < array_size; i++)
           System.out.println(array[i]);
 
       System.out.println("\nPattern :  ");
       int k = 0;
       for (int rows = 1; rows <= array_size; rows++) {
           for (int stars = 1; stars <= 5 * rows; stars++) {
 
               System.out.print(array[k++] + " ");
 
               if (stars >= 2 * rows)
                   System.out.println();
 
               if (k == array_size)
                   break;
           }
           if (k == array_size)
               break;
       }
 
       scan.close();
	}
}