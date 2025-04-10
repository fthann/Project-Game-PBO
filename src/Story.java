// Story.java

// Mengatur jalannya cerita secara berurutan.

import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        play();
    }

    public void play() {
        Scene currentScene = startScene;
        while (currentScene != null) {
            currentScene.displayScene();
            System.out.println("\nKetik 'INFO' untuk melihat status karakter.");
            System.out.print("Pilihanmu: ");
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("INFO")) {
                System.out.println("\nNama: " + player.getName());
                System.out.println("Umur: " + player.getAge());
                System.out.println("Gender: " + player.getGender());
                System.out.println("Health: " + player.getHealth());
                System.out.println("XP: " + player.getXP());
                System.out.println("Item: " + player.getItem());
                continue;
            }
            
            currentScene = currentScene.makeChoice(choice, player);
            
            if (player.getHealth() <= 0) {
                System.out.println("Game Over! Karaktermu kehabisan nyawa.");
                break;
            }
        }
        System.out.println("Petualangan berakhir.");
    }
}
