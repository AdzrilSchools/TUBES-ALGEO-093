/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rumus;

/**
 *
 * @author USER
 */

public class RPlus{
    public int[][] Penjumlahan(int [][]a, int [][]b){
        int c[][]= new int[2][2];
        for(int i=0;i<c.length;i++){
            for(int j=0 ; j<c.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
            
        return c;
}
    
    public int[][] Pengurangan(int [][]a, int [][]b){
        int c[][]= new int[2][2];
        for(int i=0;i<c.length;i++){
            for(int j=0 ; j<c.length;j++){
                c[i][j]=a[i][j]-b[i][j];
            }
        }
            
        return c;
    };
   
}
 
