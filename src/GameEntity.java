
public class GameEntity {

    private int  bossDamage;
    private int bossHealth;

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public WeaponType getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(WeaponType bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    private WeaponType bossWeapon;


}