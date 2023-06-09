public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "\nHealth: " + getHeath() +
                "\nDamage: " + getDamage() +
                "\nWeapon type: " + weapon.getTapeWeapon() +
                "\nWeapon name: " + weapon.getNameWeapon();
    }

    public String helloWorld(){
        return "";
    }

}
