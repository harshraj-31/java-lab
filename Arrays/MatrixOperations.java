// importing Scanner from java utils

import java.util.Scanner;

//Creating class for matrix opertaions
class MatrixOperations {

    public static void main(String[] args) // main class
    {
        Scanner sc = new Scanner(System.in); // Initializing scanner

        //2D array sum and multiplication
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int sum[][] = new int[2][2];
        int mul[][] = new int[2][2];

        //input elements
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                sum[i][j] = a[i][j] + b[i][j];
                mul[i][j] = a[i][j] * b[i][j];
            }
        }

        System.out.println("\tAddition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\tMultiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
