package fp1;

public class Enemy {
    public static int health;
    public static int attack;
    public void debug(String text){
        System.out.println(text);
    }
    public void init(){
        health = (int)(Math.random()*100)+70;
    }
    public int getAttack(){
        attack = (int)(Math.random()*20)+10;
        return attack;
    }
    public void takeHit(int damage){
        health -= damage;
    }
}
