/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rumus;

/**
 *
 * @author USER
 */

import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;

public class DetMatTri {

    private static Object inputan;
    
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
//        System.out.println("Masukan Nilai a11");
//    
//    int a11 = scanner.nextInt();
//    int a22 = scanner.nextInt();
//    int a21 = scanner.nextInt();
//    int a12 = scanner.nextInt();
            
//    int C[][] = new int [3][3];
//    for(int i=0;i<3;i++)
//    {
//        for(int j=0;j<3;j++)
//        { 
//            System.out.print("[" +(i+1)+ "][" +(j+1)+ "]:");
//            
//          
//                
//        }
//    }
//    
      System.out.println("\nMasukan Nilai Matriks Y");
      System.out.println("=========================");
      
       int [][]A = new int [3][3];
//       int [][]B = new int [3][3];
       
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             System.out.print("Masukan Nilai A["+i+"]["+j+"] :");
             A[i][j]= scanner.nextInt();
            }
        }
     
         
    int hasil =(A[0][0]*A[1][1])-(A[0][1]*A[1][0]);
    System.out.println ("det(a) = "+hasil);
    
}
}
