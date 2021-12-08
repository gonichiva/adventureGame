import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);


    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Macera oyununa Hoşgelidiniz");
        System.out.println("Oyuna başlamadan önce isminizi giriniz:");
        String playerName=  scan.nextLine();
        player = new Player();
        player.selectCharacter();
        start();
    }
    public void start() {
        while (true) {
            System.out.println();
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println();
            System.out.println("Eylem gerçekleştirmek için bir yer seçiniz:");
            System.out.println("1. -> Nehir = Karşınıza ayı çıkabilir.");
            System.out.println("2. -> Orman = Karşınıza vampir çıkabilir.");
            System.out.println("3. -> Mağara = Karşınıza zombi çıkabilir.");
            System.out.println("4. -> Mağaza  = Silah ve Zırh alabilirsiniz.");
            System.out.println("5. -> Güvenli Ev = Size ait güvenli mekan. Düşman yok!");

            int selectLocation = scan.nextInt();
            while (selectLocation < 0 || selectLocation > 5) {
                System.out.println("Lütfen geçerli bir yer giriniz: ");
                selectLocation = scan.nextInt();
            }
            switch (selectLocation) {
                case 1:
                    location = new River(player);
                    break;
                case 2:
                    location = new Forest(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new toolStore(player);
                    break;
                case 5:
                    location = new safeHouse(player);
                    break;
                default:
                    location = new safeHouse(player);
            }

            if (location.getClass().getName().equals("SafeHouse")){
                if (Player.getInventory().isFirewood() && Player.getInventory().isFood()&& Player.getInventory().isWater()){
                    System.out.println(" Tebrikler oyunu kazandınız !");
                    break;
                }
            }
            if (location.getLocation()){
                System.out.println(" Oyun Bitti !");
                break;
            }
        }
    }
}
