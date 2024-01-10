/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
import Rumus.Rumus;
import Rumus.RPlus;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int choice ;
        
        System.out.println("Kelompok 3");
        System.out.println("Adzril Fauzi");
        System.out.println("Anisa");
        System.out.println("Eko Nugraha S");
        System.out.println("Handayani");
        System.out.println("Silva Putri P N");
        System.out.println("");
        
        do {   
            //Mulai perulagan 
            System.out.println("=== Menu ===");
            System.out.println("1. Matriks Penjumlahan dan Pengurangan "
                    + "\n2. Matriks Transpose"
                    + "\n3. Matriks Balikan"
                    + "\n4. Determinan"
                    + "\n5. Sistem Persamaan Linear\n"
                    + "0. Keluar ");
            System.out.print("Apa yang ingin anda hitung : ");
            choice = scanner.nextInt();
            Rumus rumus = new Rumus();
            RPlus plus = new RPlus();
            
            switch (choice) {
                case 1:// Penjumlahan + Pengurangan
                    System.out.println("1. Penjumlahan\n2. Pengurangan");
                    System.out.print("Masukan Pilihan Anda : ");
                    int choice2 = scanner.nextInt();
                    int [][]a = new int [2][2];
                    int [][]b = new int [2][2];
                    int [][]c = new int [2][2];
                    switch (choice2) {
                        case 1:// sub switch 1
                            for (int i = 0; i < a.length; i++) {
                                for (int j = 0; j <a.length; j++) {
                                    System.out.print("Masukan Nilai A["+i+"]["+j+"]:");
                                    a[i][j] = scanner.nextInt();
                                }
                            }
                            
                            for (int i = 0; i < b.length; i++) {
                                for (int j = 0; j <b.length; j++) {
                                    System.out.print("Masukan Nilai B["+i+"]["+j+"]:");
                                    b[i][j] = scanner.nextInt();
                                }
                            }
                            
                            //operasi 
                            c = plus.Penjumlahan(a, b);
                            
                            for(int i=0; i<b.length; i++){
                                for(int j=0; j<b.length; j++){
                                    System.out.print(+(c[i][j])+" ");
                                }
                                System.out.println(" ");
                             }
                             System.out.println(" ");
                            
                            break;//end Of sub switch1
                        
                        case 2:// sub switch 2
                            for (int i = 0; i < a.length; i++) {
                                for (int j = 0; j <a.length; j++) {
                                    System.out.print("Masukan Nilai A["+i+"]["+j+"]:");
                                    a[i][j] = scanner.nextInt();
                                }
                            }
                            
                            for (int i = 0; i < b.length; i++) {
                                for (int j = 0; j <b.length; j++) {
                                    System.out.print("Masukan Nilai B["+i+"]["+j+"]:");
                                    b[i][j] = scanner.nextInt();
                                }
                            }
                            
                            c = plus.Pengurangan(a, b);
                            
                            for (int i = 0; i < b.length; i++) {
                                for (int j = 0; j <b.length; j++) {
                                    System.out.print(c[i][j] + " ");
                                }
                                System.out.println(" "); 
                            }
                            System.out.println(" ");
                    
                            break;// end of sub switch 2
                       
                        default:
                            throw new AssertionError();
                    }//end of sub-switch No.1
                    break;//end of plus and min
                    
                    
                    
                    
                case 2://Transpose Matriks
                    System.out.println("1. Matriks 2x2 \n2. Matriks 3x3");
                    System.out.print("Masukan Pilihan Anda : ");
                    int choice3 = scanner.nextInt();
                    
                    switch(choice3){
                        case 1://2x2
                            int [][]A= new int[2][2];
                            int [][]B= new int[2][2];
                            
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
        
                            for (int i = 0; i < A.length; i++) {
                                for (int j = 0; j < A.length; j++) {
                                    System.out.println("Hasil Tranpose AT ["+i+"]["+j+"] : " +B[i][j]); 
                                    }
                            }
                    break;//end of transpose 2x2
                    
                        case 2://3x3
                            int [][]A1= new int[3][3];
                            int [][]B1= new int[3][3];
                            
                            for (int i = 0; i < A1.length; i++) {
                                for (int j = 0; j < A1.length; j++) {
                                    System.out.print("Masukan Nilai A["+i+"]["+j+"] :");
                                    A1[i][j] = scanner.nextInt();
                                    }
                                }
                            
                            B1[0][0]=A1[0][0];
                            B1[0][1]=A1[1][0];
                            B1[1][0]=A1[0][1];
                            B1[1][1]=A1[1][1];
//                          B1[2][0]=A1[][];
        
                            for (int i = 0; i < A1.length; i++) {
                                for (int j = 0; j < A1.length; j++) {
                                    System.out.println("Hasil Tranpose AT ["+i+"]["+j+"] : " +B1[i][j]); 
                                    }
                                }
                        break;
                        default:
                            throw new AssertionError();
                        }//end of sub-switch No.1
                    break;//end of plus and min
                    
                                   
                case 3://Matriks Balikan 
                        calculateInverseMatrix(); 
                        
//                    Scanner input = new Scanner(System.in);
//                    System.out.print("Masukkan ukuran matriks (n): ");
//                    int n = input.nextInt();
// 
//                    System.out.println("Masukkan nilai matriks");
//                    double[][] matrix = new double[n][n];
//
//                    // Membaca elemen matriks dari pengguna
//                    for (int i = 0; i < n; i++) {
//                        for (int j = 0; j < n; j++) {
//                            System.out.print("Masukkan elemen matriks[" + (i + 1) + "][" + (j + 1) + "]: ");
//                            matrix[i][j] = input.nextDouble();
//                            }
//                        }
//
//                    // Menghitung matriks balikan
//                    double[][] inverseMatrix = calculateInverse(matrix);
//
//                    // Menampilkan matriks balikan
//                    System.out.println("Matriks Balikan:");
//                    displayMatrix(inverseMatrix);
//
////                    input.close();
////                    }
//
//                    // Metode untuk menghitung matriks balikan menggunakan eliminasi Gauss-Jordan
//       //             private static double[][] calculateInverse(double[][] matrix) {
//                        int n = matrix.length;
//                        double[][] augmentedMatrix = new double[n][2 * n];
//
//                    // Membuat matriks augmented [matrix | I]
//                    for (int i = 0; i < n; i++) {
//                        for (int j = 0; j < n; j++) {
//                        augmentedMatrix[i][j] = matrix[i][j];
//                        augmentedMatrix[i][j + n] = (i == j) ? 1 : 0;
//                        }
//                    }
//
//                    // Melakukan eliminasi Gauss-Jordan
//                    for (int i = 0; i < n; i++) {
//                    // Membuat leading entry menjadi 1
//                        double pivot = augmentedMatrix[i][i];
//                        for (int j = 0; j < 2 * n; j++) {
//                            augmentedMatrix[i][j] /= pivot;
//                            }
//
//                    // Menghilangkan elemen di bawah leading entry
//                    for (int k = 0; k < n; k++) {
//                        if (k != i) {
//                            double factor = augmentedMatrix[k][i];
//                            for (int j = 0; j < 2 * n; j++) {
//                                augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
//                                }
//                            }
//                        }
//                    }
//
//                    // Mengambil matriks balikan dari bagian kanan matriks augmented
//                    double[][] inverseMatrix = new double[n][n];
//                    for (int i = 0; i < n; i++) {
//                        for (int j = 0; j < n; j++) {
//                            inverseMatrix[i][j] = augmentedMatrix[i][j + n];
//                            }
//                        }
//
//                    return inverseMatrix;
//                //    }
//
//                    // Metode untuk menampilkan matriks
//               //     private static void displayMatrix(double[][] matrix) {
//                    int rows = matrix.length;
//                    int cols = matrix[0].length;
//
//                    for (int i = 0; i < rows; i++) {
//                        for (int j = 0; j < cols; j++) {
//                            System.out.print(matrix[i][j] + " ");
//                            }
//                            System.out.println();
//                        }

                    break;//end of matriks balikann
                    
                    
                  
                case 4://determinan
                     System.out.println("1. Determinan 2x2 \n2. Determinan 3x3");
                    System.out.print("Masukan Pilihan Anda : ");
                    int choice4 = scanner.nextInt();
                    
                    switch (choice4){
                        case 1:
                            int [][]A = new int [2][2];
                            
                            for(int i=0;i<2;i++){
                                for(int j=0;j<2;j++){
                                    System.out.print("Masukan Nilai A["+i+"]["+j+"] : ");
                                A[i][j]= scanner.nextInt();
                                }
                            }
       
                        int hasil =(A[0][0]*A[1][1])-(A[0][1]*A[1][0]);
                        System.out.println ("det(a) = "+hasil);
                      
                        break;
                    
                        case 2:
                            int [][]Aa = new int [3][3];
                            
                            for(int i=0;i<3;i++){
                                for(int j=0;j<3;j++){
                                    System.out.print("Masukan Nilai A["+i+"]["+j+"] : ");
                                    Aa[i][j]= scanner.nextInt();
                                    }
                                }
                            
                            int hasil1 =(Aa[0][0]*Aa[1][1])-(Aa[0][1]*Aa[1][0]);
                            System.out.println ("det(a) = "+hasil1);
                             
                    }
                    
                    break;//end of determinan
                
                case 5://SPL
                    solveLinearEquation();
//                      System.out.print("Masukkan jumlah variabel (n): ");
//        int n = input.nextInt();
//
//        double[][] augmentedMatrix = new double[n][n + 1];
//
//        System.out.println("Masukkan koefisien matriks augmented:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= n; j++) {
//                System.out.print("Masukkan elemen matriks[" + (i + 1) + "][" + (j + 1) + "]: ");
//                augmentedMatrix[i][j] = input.nextDouble();
//            }
//        }
//
//        // Menampilkan matriks augmented sebelum eliminasi
//        System.out.println("Matriks Augmented sebelum eliminasi:");
//        displayMatrix(augmentedMatrix);
//
//        // Melakukan eliminasi Gauss
//        for (int i = 0; i < n; i++) {
//            // Membuat leading entry menjadi 1
//            double pivot = augmentedMatrix[i][i];
//            for (int j = i; j <= n; j++) {
//                augmentedMatrix[i][j] /= pivot;
//            }
//
//            // Menghilangkan elemen di bawah leading entry
//            for (int k = i + 1; k < n; k++) {
//                double factor = augmentedMatrix[k][i];
//                for (int j = i; j <= n; j++) {
//                    augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
//                }
//            }
//        }
//
//        // Menampilkan matriks augmented setelah eliminasi
//        System.out.println("\nMatriks Augmented setelah eliminasi:");
//        displayMatrix(augmentedMatrix);
//
//        // Melakukan substitusi mundur
//        double[] solution = new double[n];
//        for (int i = n - 1; i >= 0; i--) {
//            solution[i] = augmentedMatrix[i][n];
//            for (int j = i + 1; j < n; j++) {
//                solution[i] -= augmentedMatrix[i][j] * solution[j];
//            }
//        }
//
//        // Menampilkan solusi
//        System.out.println("\nSolusi SPL:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("x" + (i + 1) + " = " + solution[i]);
//        }
//
//        input.close();
//    }
//
//    // Metode untuk menampilkan matriks
//    private static void displayMatrix(double[][] matrix) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
                    
                    break;//end of SPL
                    
                case 0: //keluar
                    
                  System.out.println("Keluar dari program. Sampai jumpa!");
                    System.exit(0); // Menghentikan program
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void calculateInverseMatrix() {
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

//        input.close();
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
    
    
    private static void solveLinearEquation() {
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
    }

    // Metode untuk menampilkan matriks
//    private static void displayMatrix(double[][] matrix) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
    
}  
