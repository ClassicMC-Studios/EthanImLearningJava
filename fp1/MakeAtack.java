package fp1;
import java.util.Scanner;

public class MakeAtack {
    public static String atk;
    public char playerAttack(){
        System.out.println("Attack or defend?\n a) Attack\n d) Defend");
        Scanner getAttackType = new Scanner(System.in);
        atk = getAttackType.nextLine();
        getAttackType.close();
        if(atk.equals("a")){
            return 'a';
        }else{
            return 'd';
        }
    }
}
