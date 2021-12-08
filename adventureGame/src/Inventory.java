public class Inventory {
    private boolean Water;
    private boolean Food;
    private boolean fireWood;
    private String wName;
    private String aName;
    private int Damage;
    private int Armor;

    Inventory(){
    this.setWater(false);
    this.setFood(false);
    this.setFirewood(false);
    this.setDamage(0);
    this.setArmor(0);
    this.setwName(null);
    this.setaName(null);

}

    public boolean isWater() {
        return Water;
    }

    public void setWater(boolean water) {
        Water = water;
    }

    public boolean isFood() {
        return Food;
    }

    public void setFood(boolean food) {
        Food = food;
    }

    public boolean isFirewood() {
        return fireWood;
    }

    public void setFirewood(boolean fireWood) {
        this.fireWood = fireWood;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }


}
