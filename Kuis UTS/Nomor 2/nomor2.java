import java.util.Arrays;

public class nomor2{
    public static void main(String[] args){
        System.out.println("Nama \t\t: Daffa Ammar Mahendra");
        System.out.println("NPM \t\t: 22081010189");
        System.out.println("Mata Kuliah \t: OOP F081\n");

        System.out.println("=====Macam-macam contoh Operasi Matriks=====");

        int[][] matrix_a = {
            {2,1},
            {-3,0},
        };

        int[][] matrix_b = {
            {3,5},
            {9,-2},
        };

        System.out.println("Matrix A : ");
        printArray(matrix_a);
        System.out.println("Matrix B : ");
        printArray(matrix_b);

        int[][] hasilPenjumlahan = Penjumlahan(matrix_a, matrix_b);
        System.out.println("Hasil Penjumlahan Matrix A dan B : ");
        printArray(hasilPenjumlahan);

        int[][] hasilPengurangan = Pengurangan(matrix_a, matrix_b);
        System.out.println("Hasil Pengurangan Matrix A dan B : ");
        printArray(hasilPengurangan);

        int[][] hasilPerkalian = Perkalian(matrix_a, matrix_b);
        System.out.println("Hasil Perkalian Matrix A dan B : ");
        printArray(hasilPerkalian);
    }


// Penjumlahan Matrix
    private static int[][] Penjumlahan(int[][] matrix_a, int[][] matrix_b){
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;
        int[][] hasil = new int[baris_a][kolom_a];

        if(baris_a == baris_b && kolom_a == kolom_b){


            for (int i = 0; i < baris_a; i++){
                for (int j = 0; j < kolom_a; j++){
                    hasil[i][j] = matrix_a[i][j] + matrix_b[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris/kolom tidak sama");
        }
        return hasil;
    }


// Pengurangan Matrix
    private static int[][] Pengurangan(int[][] matrix_a, int[][] matrix_b){
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;
        int[][] hasil = new int[baris_a][kolom_a];

        if(baris_a == baris_b && kolom_a == kolom_b){


            for (int i = 0; i < baris_a; i++){
                for (int j = 0; j < kolom_a; j++){
                    hasil[i][j] = matrix_a[i][j] - matrix_b[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris/kolom tidak sama");
        }
        return hasil;
    }


// Perkalian Matrix
    private static int[][] Perkalian(int[][] matrix_a, int[][] matrix_b){
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;
        int[][] hasilKali = new int[baris_a][kolom_b];

        if(baris_a == baris_b && kolom_a == kolom_b){
            int buffer;
            for (int i = 0; i < baris_a; i++){
                for (int j = 0; j < kolom_b; j++){
                buffer = 0;
                    for (int k = 0; k < kolom_a; k++){
                        buffer += matrix_a[i][k] * matrix_b[k][j];
                    }
                    hasilKali[i][j] = buffer;
                }
            }
        } else {
            System.out.println("Jumlah baris/kolom tidak sama");
        }
        return hasilKali;
    }


// Menampilkan Matrix
    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for(int i = 0; i < baris; i++){
            System.out.print("[");
            for(int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]);
                if (j < kolom - 1){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}