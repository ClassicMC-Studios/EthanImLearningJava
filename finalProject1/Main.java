package finalProject1;
import javax.swing.text.PlainDocument;

import finalProject1.*;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args){
        Player p = new Player();
        Enemy e = new Enemy();
        System.out.println("Choose your name:\n");
        p.init();e.init();
        e.debug(p.health+"");
        p.gotHit(e.getAttack());
        e.debug(p.health+"");
    }    
}
