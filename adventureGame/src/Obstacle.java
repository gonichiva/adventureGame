import java.util.Random;

public class Obstacle {

    private String name;
    private static int Healty;
    private int damage;
    private int award;
    private int maxNumber;

    public Obstacle(String name, int damage, int Healty, int award, int maxNumber ) {
        this.setName(name);
        this.setDamage(damage);
        this.setHealty(Healty);
        this.setAward(award);
        this.setMaxNumber(maxNumber);
    }

    public static int getHealty() {
        return Healty;
    }

    public static void setHealty(int healty) {
        Healty = healty;
    }

    public static void setHealty(String s) {
    }

    public int count(){
        Random r = new Random();
        return r.nextInt(this.getMaxNumber()) + 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}