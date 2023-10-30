import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] namaKaryawan = new String[100];
        boolean[] hadir = new boolean[100];
        int jumlahKaryawan = 0;

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== Manajemen Absensi Karyawan =====");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Absen Karyawan");
            System.out.println("3. Lihat Absensi Karyawan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character dari buffer input

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama karyawan: ");
                    String nama = scanner.nextLine();
                    namaKaryawan[jumlahKaryawan] = nama;
                    hadir[jumlahKaryawan] = true;
                    jumlahKaryawan++;
                    System.out.println("Karyawan berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan nomor karyawan yang akan diabsen: ");
                    int nomorKaryawan = scanner.nextInt();
                    if (nomorKaryawan >= 0 && nomorKaryawan < jumlahKaryawan) {
                        hadir[nomorKaryawan] = false;
                        System.out.println(namaKaryawan[nomorKaryawan] + " telah diabsen.");
                    } else {
                        System.out.println("Nomor karyawan tidak valid.");
                    }
                    break;
                case 3:
                    System.out.println("Daftar Absensi Karyawan:");
                    for (int i = 0; i < jumlahKaryawan; i++) {
                        System.out.println(i + ". " + namaKaryawan[i] + " - " + (hadir[i] ? "Hadir" : "Tidak Hadir"));
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }
}