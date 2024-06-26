//For a given matrix of N x M, print its transpose

import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of array: ");
        int columns = sc.nextInt();
        System.out.println("Enter the elements of array");
        int [] [] matrix = new int [rows] [columns];

        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //Printing the transpose
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
