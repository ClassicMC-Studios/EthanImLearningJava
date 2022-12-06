package finalProject1;
import java.util.Scanner;

public class Hit {
    public static String hitType;
    Scanner getOpt = new Scanner(System.in);
    public  String playerAttack(){
        System.out.println("Hit or defend?\n h) Hit\n d) Defend");
        hitType = getOpt.nextLine();
        if(hitType.equals("h")){
            System.out.println("Attack");
            return "h";
        }else{
            getOpt.close();
            return "d";
        }
    }
}
