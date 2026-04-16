import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== TUGAS PRAKTIKUM PEMROGRAMAN LANJUT ===");
        System.out.println("Nama : Vincetius Revi Wileri");
        System.out.println("NIM  : 255150707111034");
        System.out.println("------------------------------------------");

        System.out.println("\n[ TEST CASE 1: MANUSIA ]");
        Manusia m1 = new Manusia("Budi Santoso", true, "1234566", true);
        Manusia m2 = new Manusia("Siti Aminah", false, "1234567", true);
        Manusia m3 = new Manusia("Andi", true, "1234568", false);

        System.out.println("a. Laki-laki Menikah:\n" + m1);
        System.out.println("\nb. Perempuan Menikah:\n" + m2);
        System.out.println("\nc. Belum Menikah:\n" + m3);
        System.out.println("------------------------------------------");

        System.out.println("\n[ TEST CASE 2: MAHASISWA FILKOM ]");

        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("255150707111034", 2.7, "Revi Low IPK", "350701", true, false);
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("255150707111034", 3.2, "Revi Mid IPK", "350701", true, false);
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("255150707111034", 3.8, "Revi High IPK", "350701", true, false);

        System.out.println("a. IPK < 3.0:\n" + mhs1);
        System.out.println("\nb. IPK 3.0 - 3.5:\n" + mhs2);
        System.out.println("\nc. IPK 3.5 - 4.0:\n" + mhs3);
        System.out.println("------------------------------------------");

        System.out.println("\n[ TEST CASE 3: PEKERJA ]");

        Pekerja p1 = new Pekerja(1500, 2024, 1, 1, 2, "Eko", "350801", true, true);
        Pekerja p2 = new Pekerja(2000, 2017, 5, 10, 0, "Dwi", "350802", true, true);
        Pekerja p3 = new Pekerja(2500, 2005, 3, 20, 10, "Tri", "350803", true, true);

        System.out.println("a. Kerja 2 thn, 2 anak:\n" + p1);
        System.out.println("\nb. Kerja 9 thn, 0 anak:\n" + p2);
        System.out.println("\nc. Kerja 20 thn, 10 anak:\n" + p3);
        System.out.println("------------------------------------------");

        System.out.println("\n[ TEST CASE 4: MANAGER ]");
        Manager mgr = new Manager("Finance", 7500, 2011, 1, 1, 0, "Vincetius Manager", "350901", true, true);
        System.out.println(mgr);

        System.out.println("\n==========================================");
        System.out.println("Program Selesai.");
    }
}