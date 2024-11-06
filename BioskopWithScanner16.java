import java.util.Scanner;
public class BioskopWithScanner16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];
        System.out.println("------------------");
        System.out.println("Pilihan menu :");
        System.out.println("1. Input Nama");
        System.out.println("2. Daftar Penonton");
        System.out.println("3. Exit");
        System.out.println("------------------");
        while (true) {
            System.out.print("Masukkan menu (nomor menu): ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.next();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Baris atau kolom yang anda pilih telah terisi");
                    System.out.println("Silahkan cek Daftar penonton untuk melihat yang kosong");
                    continue;
                }
                if (baris > 4 || kolom > 2) {
                    System.out.println("Baris atau kolom tidak tersedia");
                    continue;
                }
                penonton[baris-1][kolom-1] = nama;
            } else if (menu == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris ke-" + (i+1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + " ");
                    }
                    System.out.println();
                }
            }else if (menu == 3) {
                System.out.println("Anda telah keluar");
                break;
            }
        }
    }
}