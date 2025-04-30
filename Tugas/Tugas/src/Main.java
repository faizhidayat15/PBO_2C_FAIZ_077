import java.util.Scanner;

public class Main {
    private final Mahasiswa[] dataMahasiswa;

    public Main() {
        dataMahasiswa = new Mahasiswa[3];
        dataMahasiswa[0] = new Mahasiswa("Faiz", "077");
        dataMahasiswa[1] = new Mahasiswa("Ahmad", "078");
        dataMahasiswa[2] = new Mahasiswa("Hazza", "066");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("Admin", "001");

        while (true) {
            System.out.println("\nPilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan;
            try {
                pilihan = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Masukkan angka yang valid!");
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();

            if (pilihan == 1) {
                System.out.println("Login sebagai Admin");
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    System.out.println("Login berhasil sebagai Admin");
                    admin.displayInfo();
                } else {
                    System.out.println("Username atau password Admin salah.");
                }
            } else if (pilihan == 2) {
                System.out.println("\nLogin sebagai Mahasiswa");
                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                boolean found = false;
                for (Mahasiswa mhs : dataMahasiswa) {
                    if (mhs.login(nama, nim)) {
                        System.out.println("Login berhasil sebagai Mahasiswa");
                        mhs.displayInfo();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Nama atau NIM Mahasiswa salah.");
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm!");
                break;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}