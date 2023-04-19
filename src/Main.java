public class Main {
    public static void main(String[] args) {
//        Weapon weapon= new Weapon();
        Boss boss = new Boss();
        boss.setHeath(700);
        boss.setDamage(50);
        boss.weapon.setNameWeapon(" Hummer ");


        System.out.println("Boss health: " + boss.getHeath()+ " Damage: "
                + boss.getDamage() + " Tape weapon: "+ WeaponType.COLD +" Name weapon: "
                + boss.weapon.getNameWeapon());
    }
}