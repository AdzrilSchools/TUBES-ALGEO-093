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

public class Transpose {
    public void main (String[]args)
    {
        Scanner input =new Scanner(System.in);
        int baris,kolom;
        
        System.out.println("masukkan jumlah baris =");
        baris=input.nextInt();
        System.out.println("masukkan jumlah kolom =");
        kolom=input.nextInt();
        int data[][] = new int[baris][kolom];
        
        for(int i=0; i<baris;i++) 
        {
            for(int j=0; j<kolom;j++){
                System.out.println("masukkan nilai ke-("+i+", "+j+" =");
                data[i][j]=input.nextInt();   
                }         
            }
        System.out.print("matriks biasa = \n");
        for(int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.print(data [i][j]+ "");
            }
            System.out.print("\n");
            {
        }
        int transpose[][]= new int[kolom][baris];
        for( i=0; i<baris; i++){
            for(int j=0; j<kolom; j++){
                transpose[j][i]=data[i][j];
            }
        }
        System.out.println("masukkan transpose =\n");
        for( i=0; i<baris; i++){
                int j;
            for(j=0; j<kolom; j++);{
                System.out.println(transpose[j][i]+"");
            }
            System.out.print("\n");
        }
        }
    }
}