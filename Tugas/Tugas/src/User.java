class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void login() {
        System.out.println("Login User");
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }
}

class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    public boolean login(String inputNama, String inputNim) {
        return this.getNama().equals(inputNama) && this.getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mahasiswa Login Sukses: " + getNama());
    }
}

class Admin extends User {
    private String username = "admin";
    private String password = "admin123";

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Login Sukses: " + getNama());
    }
}
