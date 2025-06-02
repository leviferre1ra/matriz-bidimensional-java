package app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] mat = new int[n][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println("Diagonal Principal: ");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();


        int count = 0;
        for(int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Número negativos = " + count);


        scan.close();
    }
}
