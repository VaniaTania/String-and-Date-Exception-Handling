import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SupermarketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bagian Login
        String correctUsername = "Vannesa";
        String correctPassword = "password123";
        boolean loginSuccess = false;

        while (!loginSuccess) {
            System.out.println("+-----------------------+");
            System.out.println("Log in");
            System.out.println("+-----------------------+");
            System.out.print("Username : ");
            String username = scanner.nextLine();
            System.out.print("Password : ");
            String password = scanner.nextLine();
            System.out.print("Captcha (Masukkan '12345'): ");
            String captcha = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword) && captcha.equals("12345")) {
                System.out.println("Login berhasil!");
                loginSuccess = true;
            } else {
                System.out.println("Login gagal, silakan coba lagi.");
            }
        }

        // Menampilkan Selamat Datang dan Waktu
        System.out.println("+-----------------------+");
        System.out.println("Selamat Datang di Supermarket <Van’s mart>");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");
        System.out.println("Tanggal dan Waktu : " + dateFormat.format(new Date()));
        System.out.println("+-----------------------+");

        // Input Detail Transaksi
        System.out.println("No. Faktur: VAN-" + System.currentTimeMillis());
        System.out.print("Kode Barang : ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang : ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Barang : ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Jumlah Beli : ");
        int jumlahBeli = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        // Menghitung Total
        double total = hargaBarang * jumlahBeli;

        // Menampilkan Struk
        System.out.println("+-----------------------+");
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang : Rp" + String.format("%,.2f", hargaBarang));
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("TOTAL : Rp" + String.format("%,.2f", total));
        System.out.println("+-----------------------+");

        // Input Nama Kasir
        System.out.print("Kasir : ");
        String namaKasir = scanner.nextLine();
        System.out.println("+-----------------------+");
        System.out.println("Terima kasih telah berbelanja di <Van’s mart>");
        System.out.println("Kasir : " + namaKasir);
        System.out.println("+-----------------------+");

        scanner.close();
    }
}