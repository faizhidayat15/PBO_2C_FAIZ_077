package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku NonFiksi = new NonFiksi("Inspirasi & Motivasi B.J. Habibie", "B.J. Habibie", "Buku Motivasi");
        Buku Fiksi = new Fiksi("Jujutsu Kaisen", "Gege Utami", "Horor & comedy");

        // Menampilkan info buku
        NonFiksi.DisplayInfo();
        Fiksi.DisplayInfo();
        System.out.println();

        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Thouf Hazza Tedya Putera", "C066");
        Anggota anggota2 = new Anggota("Ahmad Dzaky Awwab", "C078");

        // Menampilkan info anggota
        anggota1.DisplayInfo();
        anggota2.DisplayInfo();
        System.out.println();

        // Proses peminjaman
        anggota1.PinjamBuku("Inspirasi & Motivasi B.J. Habibie");
        anggota2.PinjamBuku("Jujutsu Kaisen", 14);
        System.out.println();

        // Proses pengembalian
        anggota1.KembalikanBuku("Inspirasi & Motivasi B.J. Habibie");
        anggota2.KembalikanBuku("Jujutsu Kaisen");
    }
}