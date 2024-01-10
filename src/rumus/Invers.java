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

public class Invers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran matriks (n): ");
        int n = input.nextInt();

        System.out.println("Masukkan nilai matriks");
        double[][] matrix = new double[n][n];

        // Membaca elemen matriks dari pengguna
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Masukkan elemen matriks[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = input.nextDouble();
            }
        }

        // Menghitung matriks balikan
        double[][] inverseMatrix = calculateInverse(matrix);

        // Menampilkan matriks balikan
        System.out.println("Matriks Balikan:");
        displayMatrix(inverseMatrix);

        input.close();
    }

    // Metode untuk menghitung matriks balikan menggunakan eliminasi Gauss-Jordan
    private static double[][] calculateInverse(double[][] matrix) {
        int n = matrix.length;
        double[][] augmentedMatrix = new double[n][2 * n];

        // Membuat matriks augmented [matrix | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatrix[i][j] = matrix[i][j];
                augmentedMatrix[i][j + n] = (i == j) ? 1 : 0;
            }
        }

        // Melakukan eliminasi Gauss-Jordan
        for (int i = 0; i < n; i++) {
            // Membuat leading entry menjadi 1
            double pivot = augmentedMatrix[i][i];
            for (int j = 0; j < 2 * n; j++) {
                augmentedMatrix[i][j] /= pivot;
            }

            // Menghilangkan elemen di bawah leading entry
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmentedMatrix[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
                    }
                }
            }
        }

        // Mengambil matriks balikan dari bagian kanan matriks augmented
        double[][] inverseMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverseMatrix[i][j] = augmentedMatrix[i][j + n];
            }
        }

        return inverseMatrix;
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
    }
}
