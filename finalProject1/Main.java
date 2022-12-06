package finalProject1;
import finalProject1.*;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args){
        gameLoop();
    }   
    public static void gameLoop(){
        Player p = new Player();
        Enemy e = new Enemy();
        Hit h = new Hit();
        System.out.println("Choose your name:\n");
        p.init();e.init();
        if((h.playerAttack()).equals("h")){
            e.debug("lol");
        } 
    } 
}
