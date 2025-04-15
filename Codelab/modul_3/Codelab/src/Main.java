class KarakterGame {
    private int kesehatan;

    public int getKesehatan() {
        return kesehatan;
    }

    public KarakterGame(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        System.out.println("Karakter Umum menyerang target!");
    }

    public void kurangiKesehatan(int damage) {
        this.kesehatan -= damage;
    }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(int kesehatan) {
        super(kesehatan);
    }

    public void serang(KarakterGame target) {
        System.out.println("Pahlawan menyerang target!");
        // Mengurangi kesehatan target sebanyak 15
        target.kurangiKesehatan(15);
    }
}

class Musuh extends KarakterGame {
    public Musuh(int kesehatan) {
        super(kesehatan);
    }

    public void serang(KarakterGame target) {
        System.out.println("Musuh menyerang target!");
        target.kurangiKesehatan(20);
    }
}

public class Main {
    public static void main(String[] args) {
        KarakterGame karakterUmum = new KarakterGame(100);
        Pahlawan brinstone = new Pahlawan(150);
        Musuh viper = new Musuh(200);

        System.out.println("Status awal:");
        System.out.println("Brinstone memiliki kesehatan: " + brinstone.getKesehatan());
        System.out.println("Viper memiliki kesehatan: " + viper.getKesehatan());

        brinstone.serang(viper);
        viper.serang(brinstone);

        System.out.println("Kesehatan setelah bertarung:");
        System.out.println("Brinstone sekarang memiliki kesehatan: " + brinstone.getKesehatan());
        System.out.println("Viper sekarang memiliki kesehatan: " + viper.getKesehatan());
    }
}