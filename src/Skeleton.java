public class Skeleton extends Boss{
    int arrow;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    public String printInfo(){
        return "\nHealth: " + getHeath() +
                "\nDamage: " + getDamage() +
                "\nArrow: " + getArrow() +
                "\nWeapon type: " + weapon.getTapeWeapon() +
                "\nWeapon name: " + weapon.getNameWeapon();
    }
}
