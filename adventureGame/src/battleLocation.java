public abstract class battleLocation extends Location {
    protected Obstacle obstacle;
    protected String Award;

    battleLocation(Player player, String name, Obstacle obstacle, String Award) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
       this.Award = Award;
    }

    public boolean getLocation(){
        int obstacleCount= obstacle.count();
        System.out.println("Şuan Buradasınız: " + this.getname());
        System.out.println("Burada dikkatlı ol!!  " + obstacleCount+ "  Tane  "+ obstacle.getName() + " Yaşıyor!!");
        System.out.println("Savaş veya Kaç.");
        String selectCase=scan.nextLine();
        selectCase=selectCase.toUpperCase();
        if (selectCase.equals("S")) {
            if (combat(obstacleCount)) {
                System.out.println(this.getname() + "  Bölgesindeki tüm düşmanları temizlediniz !");
                if (this.Award.equals("  Food  ") && player.getInventory().isFood() == false) {
                    System.out.println(this.Award + "  Kazandınız ! ");
                    player.getInventory().setFood(true);
                } else if (this.Award.equals("  Water  ") && player.getInventory().isWater() == false) {
                    System.out.println(this.Award + "  Kazandınız !");
                    player.getInventory().setWater(true);
                } else if (this.Award.equals("  Firewood  ") && player.getInventory().isFirewood() == false) {
                    System.out.println(this.Award + "   Kazandınız !");
                    player.getInventory().setFirewood(true);
                }
                return true;
            }
            if (player.getHealty() <= 0) {
                System.out.println("Öldünüz !");
                return false;
            }
        }
        return true;
    }
    
    public boolean combat(int obstacleCount){

        for (int a = 0; a < obstacleCount; a ++) {
            playerStats();
            enemyStats();

            while (player.getHealty() > 0 && obstacle.getHealty() >0) {
                System.out.println("Vur && Kaç: ");
                String selectCase = scan.nextLine();
                selectCase = selectCase.toUpperCase();

                if (selectCase.equals("V")) {
                    System.out.println("Vurdunuz!!");
                    Obstacle.setHealty(Obstacle.getHealty());
                    Obstacle.setHealty(Player.gettotalDamage());
                    afterHit();
                    if (obstacle.getHealty() > 0){
                        System.out.println();

                        System.out.println("Canavar sizi VURDUUUUU!!!!!  ");
                    player.setHealty(player.getrHealty()- (obstacle.getDamage()- player.getInventory().getArmor()));
                    afterHit();
                    }
                }
                else{
                    return false;
                }
            }
        }
        if (obstacle.getHealty() < player.getHealty() ){
            System.out.println("Düşmanı yendiniz !!");
            player.setMoney(player.getMoney() + obstacle.getAward());
            System.out.println("Güncel Paranız :" + player.getMoney());
            int defobstacleHealty = Obstacle.getHealty();
            obstacle.setHealty(defobstacleHealty);
        }else{
            return false;
        }
        System.out.println("------------------------------------------");
        return false;
    }

    public void afterHit(){
        System.out.println("Oyuncu canı: " + player.getHealty());
        System.out.println(obstacle.getName() + "Canı: " + obstacle.getHealty());
        System.out.println();
    }

    public void enemyStats() {
        System.out.println();
        System.out.println(obstacle.getName() + "Değerleri\n--------------");
        System.out.println("Can:" + obstacle.getHealty());
        System.out.println("Hasar:" + obstacle.getDamage());
        System.out.println("Ödül:" + obstacle.getAward());
    }
    public void playerStats() {
        System.out.println();
        System.out.println("Oyuncu Değerleri\n----------------------------- ");
        System.out.println("Can:" + player.getHealty());
        System.out.println("Hasar:" + player.gettotalDamage());
        System.out.println("Para:" + player.getMoney());
        if (player.getInventory().getDamage() > 0) {
            System.out.println("Silah:" + player.getInventory().getwName());
        }
        if (player.getInventory().getArmor() > 0) {
            System.out.println("Zırh:" + player.getInventory().getwName());
        }
    }
}