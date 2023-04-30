public class Main {
    public static void main(String[] args) {
        //Weapon weapon = new Weapon();
        Boss boss = new Boss();
        Skeleton skeleton = new Skeleton();
        boss.setHeath(700);
        boss.setDamage(50);
        boss.weapon.setNameWeapon(" Hummer ");
        boss.weapon.setTapeWeapon(WeaponType.COLD);


        System.out.println("Boss health: " + boss.getHeath() +
                " Damage: " + boss.getDamage() +
                " Tape weapon: "+ boss.weapon.getTapeWeapon() +
                " Name weapon: " + boss.weapon.getNameWeapon());
        System.out.println(boss.printInfo());
        skeleton.setDamage(10);
        skeleton.setHeath(880);
        skeleton.setArrow(50);
        skeleton.weapon.setNameWeapon("Cold");
        skeleton.weapon.setTapeWeapon(WeaponType.fireWeapon);
        System.out.println(skeleton.printInfo());
    }

}