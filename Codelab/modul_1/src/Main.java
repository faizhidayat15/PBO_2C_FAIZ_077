import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Closing the scanner
        scanner.close();

        // Calculate the age
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Determine the gender
        String gender;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            gender = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            gender = "Perempuan";
        } else {
            gender = "Tidak dikenal";
        }

        // Display the result
        System.out.println("\nData Diri:");
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur        : " + umur + " tahun");

        System.out.println("\nProcess finished with exit code 0");
    }
}
