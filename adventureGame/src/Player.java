import java.util.Scanner;

public class Player {
    private static String totalDamage;
    private static Inventory ınventory;
    private static int damage;
    private static int Healty;
    private int rHealty;
    private static int money;
    private String name;
    private String cName;
    private Scanner scan= new Scanner(System.in);

    public Player() {
        this.setName(getName());
        this.setInventory(new Inventory());

    }

    public static String gettotalDamage() {
        return totalDamage;
    }

    public static void setTotalDamage(String totalDamage) {
        Player.totalDamage = totalDamage;
    }

    public static Inventory getInventory() {
        return ınventory;
    }

    public static void setInventory(Inventory ınventory) {
        Player.ınventory = ınventory;
    }

    public static int getDamage() {
        return damage;
    }

    public static void setDamage(int damage) {
        Player.damage = damage;
    }

    public static int getHealty() {
        return Healty;
    }

    public static void setHealty(int healty) {
        Healty = healty;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Player.money = money;
    }

    public void selectCharacter(){
        switch (characterMenu()) {
            case 1 -> initPlayer("Samuray", 5, 21, 15);
            case 2 -> initPlayer("Okçu", 7, 18, 20);
            case 3 -> initPlayer("Şövalye", 8, 24, 5);
            default -> initPlayer("Samuray", 5, 21, 15);
        }
        System.out.println("Karakter: " + getcName() + "\t Hasar: " + getDamage() + "\t Sağlık: " + getHealty() + "\t Para: " + getMoney());

    }
    public int characterMenu() {
        System.out.println("Bir karakter seçiniz: ");
        System.out.println("1. Samuray, \t Hasar: 5 \t Sağlık: 21 \t Para:15");
        System.out.println("2. Okçu , \t Hasar: 7, \t Sağlık: 18, \t Para:20");
        System.out.println("3. Şövalye, \t Hasar: 8, \t Sağlık: 24 \t Para:5");
        System.out.println("Seçiminiz");
        int characterID = getScan().nextInt();


        while (characterID < 1 || characterID > 3) {
            System.out.println("Geçerli Karakter giriniz");
            characterID = getScan().nextInt();
        }
        return characterID;
    }
    public void initPlayer(String cName, int Damage, int Healty, int Money){
     setcName(cName);
     setDamage(Damage);
     setHealty(Healty);
     Player.setMoney(Money);
     setHealty(getrHealty());

 }

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rHealty) {
        this.rHealty = rHealty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}



