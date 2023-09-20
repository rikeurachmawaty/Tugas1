package projek1_rikeurachmawaty_c2183207025_pti5a;

import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk panjang alas dan tinggi segitiga
        double alas, tinggi;

        // Meminta pengguna memasukkan panjang alas
        System.out.print("Masukkan panjang alas segitiga: ");
        alas = input.nextDouble();

        // Meminta pengguna memasukkan tinggi segitiga
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        System.out.println("Luas segitiga adalah: " + luas);

        // Menutup objek Scanner
        input.close();
    }
}