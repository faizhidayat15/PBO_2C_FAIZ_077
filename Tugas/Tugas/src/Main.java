import java.util.Scanner;

public class main {


}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (pilihan == 1) {
                loginAdmin(scanner);
            } else if (pilihan == 2) {
                loginMahasiswa(scanner);
            } else if (pilihan == 3) {
                System.out.println("Terima kasih");
                break;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        scanner.close();
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.println("Login sebagai Admin");
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login berhasil sebagai Admin");
        } else {
            System.out.println("Username atau password Admin salah");
        }
    }

    private static void loginMahasiswa(Scanner scanner) {
        System.out.println("Login sebagai Mahasiswa");
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals("mahasiswa") && password.equals("mhs123")) {
            System.out.println("Login berhasil sebagai Mahasiswa");
        } else {
            System.out.println("Username atau password Mahasiswa salah");
        }
    }
}
