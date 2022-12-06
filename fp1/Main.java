package fp1;
import fp1.*;

public class Main {
    public static void main(String[] args){
        gameLoop();
    }
    public static void gameLoop(){
        Player ply = new Player();
        Enemy enm = new Enemy();
        MakeAtack ma = new MakeAtack();
        ply.init();enm.init();
        if(ma.playerAttack() == 'a'){
            System.out.println("Attack");
        }
    }
}
