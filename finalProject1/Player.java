package finalProject1;

import java.util.Scanner;

public class Player {
    public static int health;
    public static String name;
    public void debug(String text){
        System.out.println(text);
    }
    public void init(){
        Scanner getName = new Scanner(System.in);
        name = getName.nextLine();
        getName.close();
        health = (int)(Math.random() * 100)+100;
    }
    public void gotHit(int damage){
        health -= damage;
    }
}
