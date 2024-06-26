//Take a matrix as input from the user. Search for a given number x
//and print the indices at which it occurs.
import java.util.*;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the elements of array");
        int [] [] numbers = new int [rows] [columns];
        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to search in the array: ");
        int x = sc.nextInt();

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //compare with x
                if (numbers[i][j] == x)
                    System.out.println("x found at index ("+i+","+j+")");
            }
        }
    }
}