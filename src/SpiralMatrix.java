//Print the spiral order matrix as output for a given matrix of numbers.

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println("Enter the elements of array");
        int [] [] matrix = new int [rows] [columns];
        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The spiral order matrix is: ");

        int rowStart = 0;
        int rowEnd = rows-1;
        int columnStart = 0;
        int columnEnd = columns-1;

        //to print spiral order matrix
        while (rowStart <= rowEnd && columnStart <= columnEnd){
            //1
            for (int column = columnStart; column <= columnEnd; column++) {
                System.out.print(matrix[rowStart][column] + " ");
            }
            rowStart++;

            //2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][columnEnd] + " ");
            }
            columnEnd--;

            //3
            for (int column = columnEnd; column >= columnStart; column--) {
                System.out.print(matrix[rowEnd][column] + " ");
            }
            rowEnd--;

            //4
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][columnStart] + " ");
            }
            columnStart++;

            System.out.println();
        }
    }
}
