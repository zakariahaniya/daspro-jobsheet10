import java.util.Scanner;
public class SIAKAD16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int matkul = sc.nextInt();
        int[][] nilai = new int[jumlah][matkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/nilai.length);
        }
        System.out.println("\n==================================");
        System.out.println("Rata-rata nilai setiap Mata Kuliah");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/nilai[0].length);
        }
    }
}