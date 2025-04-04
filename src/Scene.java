// Scene.java
public class Scene {
    private String description;
    private String choiceA, choiceB, choiceC;
    private Scene nextSceneA, nextSceneB, nextSceneC;
    private int damageA, damageB, damageC;
    private int XPA, XPB, XPC;

    public Scene(String description, String choiceA, Scene nextSceneA, int damageA, int XPA,
                 String choiceB, Scene nextSceneB, int damageB, int XPB,
                 String choiceC, Scene nextSceneC, int damageC, int XPC) {
        this.description = description;
        this.choiceA = choiceA;
        this.nextSceneA = nextSceneA;
        this.damageA = damageA;
        this.XPA = XPA;
        this.choiceB = choiceB;
        this.nextSceneB = nextSceneB;
        this.damageB = damageB;
        this.XPB = XPB;
        this.choiceC = choiceC;
        this.nextSceneC = nextSceneC;
        this.damageC = damageC;
        this.XPC = XPC;
    }

    public void displayScene() {
        System.out.println("\n" + description);
        System.out.println("A: " + choiceA);
        System.out.println("B: " + choiceB);
        System.out.println("C: " + choiceC);
    }

    public Scene makeChoice(String choice, Character player) {
        switch (choice.toUpperCase()) {
            case "A":
                player.takeDamage(damageA);
                player.addXP(XPA);
                return nextSceneA;
            case "B":
                player.takeDamage(damageB);
                player.addXP(XPB);
                return nextSceneB;
            case "C":
                player.takeDamage(damageC);
                player.addXP(XPC);
                return nextSceneC;
            default:
                System.out.println("Pilihan tidak valid! Coba lagi.");
                return this;
        }
    }
}
