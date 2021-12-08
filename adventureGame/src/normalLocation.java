import java.util.Scanner;

public abstract class normalLocation extends Location{
    Scanner scan = new Scanner(System.in);

    normalLocation(Player player, String name ) {
        super(player);
        this.name=name;
    }
    @Override
    public abstract boolean getLocation();

}
