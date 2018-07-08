package homeWork.game.warriors;

public class Paladin extends Gladiator {
    private static int random(int min,int max){
        return (int)(min + Math.random() * (max - min));
    }
    private int power = random(5, 25);
    private int damage = random(10, 40);
    private int health = random(400, 800);

    public int strength(){
        return weaponWarrior.strength() - (damage + power);
    }

    public int attack(){
        return damage + power + weaponWarrior.damage();
    }
    public void protection(int  damage){
        health -= damage;
    }

    @Override
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
