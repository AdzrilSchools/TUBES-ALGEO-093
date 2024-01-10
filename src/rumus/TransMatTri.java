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

public class TransMatTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]A= new int[3][3];
        int [][]B= new int[3][3];
        
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Masukan Nilai A["+i+"]["+j+"] :");
                A[i][j] = scanner.nextInt();
            }
        }
        B[0][0]=A[0][0];
        B[0][1]=A[1][0];
        B[1][0]=A[0][1];
        B[1][1]=A[1][1];
        B[0][2]=A[2][0];
        B[2][2]=A[2][2];
        B[2][0]=A[0][2];
        B[2][1]=A[1][2];
        B[0][0]=A[0][0];
      
        
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.println("Hasil Tranpose AT ["+i+"]["+j+"] : " +B[i][j]); 
            }
        }
                
    }
    
}
