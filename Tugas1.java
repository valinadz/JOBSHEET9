import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int jumlahElemen = sc.nextInt();

        int[] nilaiArray = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiArray[i] = sc.nextInt();
        }

        int nilaiTertinggi = nilaiArray[0];
        int nilaiTerendah = nilaiArray[0];
        int total = nilaiArray[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (nilaiArray[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiArray[i];
            }
            if (nilaiArray[i] < nilaiTerendah) {
                nilaiTerendah = nilaiArray[i];
            }
            total += nilaiArray[i];
        }

        double rataRata = (double) total / jumlahElemen;

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}
    