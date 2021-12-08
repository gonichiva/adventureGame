public class safeHouse extends normalLocation {

    safeHouse(Player player) {
        super(player,"Güvenli Ev");
    }

    @Override
    public boolean getLocation(){
        player.setrHealty(player.getrHealty());
        System.out.println("Güvenli Ev'e geldiniz.");
        System.out.println("Canınız yenilendi.");
        return true;
    }
}
