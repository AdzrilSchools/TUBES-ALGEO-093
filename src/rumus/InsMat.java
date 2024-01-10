/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rumus;

/**
 *
 * @author USER
 */
public class InsMat {
    public int balikan (int [][]a1, int [][]b1){
        double[][] matrix = null;
     
        int c1 = matrix.length;
        double[][] augmentedMatrix = new double[c1][2 * c1];
        double[][] inverseMatrix = new double[c1][c1];

        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < c1; j++) {
                augmentedMatrix[i][j] = matrix[i][j];
                augmentedMatrix[i][j + c1] = (i == j) ? 1 : 0;
            }
        }

        for (int i = 0; i < c1; i++) {
            // Membuat leading entry menjadi 1
            double pivot = augmentedMatrix[i][i];
            for (int j = 0; j < 2 * c1; j++) {
                augmentedMatrix[i][j] /= pivot;
            }
            
              for (int k = 0; k < c1; k++) {
                if (k != i) {
                    double factor = augmentedMatrix[k][i];
                    for (int j = 0; j < 2 * c1; j++) {
                        augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
                    }
                }
            }
        }
        
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < c1; j++) {
                inverseMatrix[i][j] = augmentedMatrix[i][j + c1];
            }
        }
            
        return c1;
    }
}
