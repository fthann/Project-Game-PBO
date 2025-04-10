// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama karaktermu: ");
        String name = input.nextLine();

        System.out.print("Masukkan umur karaktermu: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan gender karaktermu (Laki-laki/Perempuan): ");
        String gender = input.nextLine();

        Character player = new Character(name, age, gender, 100);

        // Membuat 10 scene (dari akhir ke awal)
        Scene scene10 = new Scene("Kamu berhasil mendarat di planet baru yang layak huni.",
            "Mulai hidup baru", null, 0, 50,
            "Jelajahi planet", null, 5, 10,
            "Kirim sinyal ke bumi", null, 0, 5);

        Scene scene9 = new Scene("Planet ditemukan, tapi penuh bahaya.",
            "Scan lingkungan", scene10, 0, 10,
            "Mendarat cepat", scene10, 10, 5,
            "Cari planet lain", scene10, 5, 0);

        Scene scene8 = new Scene("Persediaan menipis.",
            "Cek kompartemen cadangan", scene9, 0, 10,
            "Minta bantuan dari alien", scene9, 10, 5,
            "Abaikan dan lanjut", scene9, 15, 0);

        Scene scene7 = new Scene("Sinyal misterius terdeteksi.",
            "Ikuti sinyal", scene8, 5, 10,
            "Abaikan sinyal", scene8, 0, 0,
            "Lacak sumbernya", scene8, 10, 5);

        Scene scene6 = new Scene("Navigasi sistem bermasalah.",
            "Perbaiki manual", scene7, 10, 10,
            "Gunakan sistem backup", scene7, 0, 5,
            "Abaikan", scene7, 15, 0);

        Scene scene5 = new Scene("Alien jahat menyerang!",
            "Lawan", scene6, 20, 20,
            "Gunakan strategi", scene6, 10, 15,
            "Kabur", scene6, 5, 5);

        Scene scene4 = new Scene("Kamu melihat kapal alien!",
            "Coba berkomunikasi", scene5, 0, 10,
            "Serang", scene5, 20, 5,
            "Kabur", scene5, 10, 0);

        Scene scene3 = new Scene("Hujan asteroid mendekat!",
            "Hindari dengan kecepatan tinggi", scene4, 5, 10,
            "Gunakan perisai", scene4, 0, 5,
            "Terobos", scene4, 15, 0);

        Scene scene2 = new Scene("Kamu hampir tertarik ke lubang hitam!",
            "Gunakan mesin dorong", scene3, 5, 10,
            "Gunakan gravitasi", scene3, 10, 15,
            "Abaikan peringatan", scene3, 20, 5);

        Scene scene1 = new Scene("Bumi hancur! Kamu harus pergi mencari planet baru.",
            "Pergi ke luar angkasa", scene2, 0, 10,
            "Sembunyi di bunker", scene2, 5, 5,
            "Lawan alien", scene2, 20, 10);

        Story story = new Story(scene1, player);
        story.start();
    }
}
