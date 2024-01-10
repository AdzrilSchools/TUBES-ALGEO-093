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


public class Determinan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input elemen-elemen matriks 3x3
        System.out.println("Masukkan elemen-elemen matriks 3x3:");
        int[][] matriks = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan elemen matriks[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        // Menghitung determinan
        int determinan = hitungDeterminan(matriks);

        // Menampilkan determinan
        System.out.println("Determinan matriks 3x3 adalah: " + determinan);
    }

    // Fungsi untuk menghitung determinan matriks 3x3
    public static int hitungDeterminan(int[][] matriks) {
        int det = 0;

        det += matriks[0][0] * kofaktor(matriks, 0, 0);
        det -= matriks[0][1] * kofaktor(matriks, 0, 1);
        det += matriks[0][2] * kofaktor(matriks, 0, 2);

        return det;
    }

    // Fungsi untuk menghitung kofaktor
    public static int kofaktor(int[][] matriks, int baris, int kolom) {
        int[][] minor = new int[2][2];
        int minorBaris = 0, minorKolom = 0;

        for (int i = 0; i < 3; i++) {
            if (i != baris) {
                for (int j = 0; j < 3; j++) {
                    if (j != kolom) {
                        minor[minorBaris][minorKolom] = matriks[i][j];
                        minorKolom++;
                    }
                }
                minorBaris++;
                minorKolom = 0;
            }
        }

        return (int) Math.pow(-1, baris + kolom) * (minor[0][0] * minor[1][1] - minor[0][1] * minor[1][0]);
    }
}