public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossDamage(123124);
        boss.setBossHealth(63463234);
        boss.setBossWeapon(WeaponType.SWORD);

        System.out.println(boss.getBossDamage());
        System.out.println(boss.getBossHealth());
        System.out.println(boss.getBossWeapon());




    }
}