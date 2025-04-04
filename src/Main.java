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

        // Membuat 10 scene
        Scene planetScene = new Scene("Kamu berhasil menemukan planet layak huni!", 
            "Mendarat", null, 0, 50, 
            "Lewati", null, 10, 10, 
            "Kembali", null, 5, 5
        );

        Scene blackHoleScene = new Scene("Kamu hampir tertarik ke lubang hitam!", 
            "Gunakan mesin dorong", planetScene, 5, 10, 
            "Gunakan gravitasi", planetScene, 10, 15, 
            "Abaikan peringatan", planetScene, 20, 5
        );

        Scene asteroidScene = new Scene("Hujan asteroid mendekat!", 
            "Hindari dengan kecepatan tinggi", blackHoleScene, 5, 10, 
            "Gunakan perisai", blackHoleScene, 0, 5, 
            "Terobos", blackHoleScene, 15, 0
        );

        Scene alienShipScene = new Scene("Kamu melihat kapal alien!", 
            "Coba berkomunikasi", asteroidScene, 0, 10, 
            "Serang", asteroidScene, 20, 5, 
            "Kabur", asteroidScene, 10, 0
        );

        Scene battleScene = new Scene("Alien jahat menyerang!", 
            "Lawan", alienShipScene, 20, 20, 
            "Gunakan strategi", alienShipScene, 10, 15, 
            "Kabur", alienShipScene, 5, 5
        );

        Scene startScene = new Scene("Bumi hancur! Kamu harus pergi mencari planet baru.", 
            "Pergi ke luar angkasa", battleScene, 0, 10, 
            "Sembunyi di bunker", battleScene, 5, 5, 
            "Lawan alien", battleScene, 20, 10
        );

        Story story = new Story(startScene, player);
        story.start();
    }
}
