// Character.java

// Menyimpan dan mengelola data karakter pemain.
public class Character {
    private String name;
    private int age;
    private String gender;
    private int health;
    private int XP;
    private String item;

    public Character(String name, int age, String gender, int health) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.health = health;
        this.XP = 0;
        this.item = "None";
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    // Fungsi untuk mengurangi kesehatan karakter.

    public void addXP(int additionalXP) {
        this.XP += additionalXP;
    }

    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getHealth() {
        return health;
    }

    public int getXP() {
        return XP;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
