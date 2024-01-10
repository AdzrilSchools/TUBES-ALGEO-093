/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rumus;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class SPL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah variabel (n): ");
        int n = input.nextInt();

        double[][] augmentedMatrix = new double[n][n + 1];

        System.out.println("Masukkan koefisien matriks augmented:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("Masukkan elemen matriks[" + (i + 1) + "][" + (j + 1) + "]: ");
                augmentedMatrix[i][j] = input.nextDouble();
            }
        }

        // Menampilkan matriks augmented sebelum eliminasi
        System.out.println("Matriks Augmented sebelum eliminasi:");
        displayMatrix(augmentedMatrix);

        // Melakukan eliminasi Gauss
        for (int i = 0; i < n; i++) {
            // Membuat leading entry menjadi 1
            double pivot = augmentedMatrix[i][i];
            for (int j = i; j <= n; j++) {
                augmentedMatrix[i][j] /= pivot;
            }

            // Menghilangkan elemen di bawah leading entry
            for (int k = i + 1; k < n; k++) {
                double factor = augmentedMatrix[k][i];
                for (int j = i; j <= n; j++) {
                    augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
                }
            }
        }

        // Menampilkan matriks augmented setelah eliminasi
        System.out.println("\nMatriks Augmented setelah eliminasi:");
        displayMatrix(augmentedMatrix);

        // Melakukan substitusi mundur
        double[] solution = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            solution[i] = augmentedMatrix[i][n];
            for (int j = i + 1; j < n; j++) {
                solution[i] -= augmentedMatrix[i][j] * solution[j];
            }
        }

        // Menampilkan solusi
        System.out.println("\nSolusi SPL:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }

        input.close();
    }

    // Metode untuk menampilkan matriks
    private static void displayMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
