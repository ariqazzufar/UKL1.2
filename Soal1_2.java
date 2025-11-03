import java.util.Scanner;

public class Soal1_2 {

    public static void main(String[] args) {
        // 1. Inisialisasi Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // 2. Input bilangan
        System.out.println("=== Penentuan Bilangan Ganjil/Genap ===");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scanner.nextInt();

        // 3. Penentuan Ganjil atau Genap
        // Menggunakan operator modulus (%) untuk mencari sisa bagi
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah Bilangan Genap.");
        } else {
            System.out.println(bilangan + " adalah Bilangan Ganjil.");
        }

        // Tutup scanner
        scanner.close();
    }
}
