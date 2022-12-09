package fp1;
import java.util.Scanner;

public class MakeAtack {
    public String atk;
    public void playerAttack(){
        Scanner getAttackType = new Scanner(System.in);
        System.out.println("Attack or defend?\n a) Attack\n d) Defend");
        atk = getAttackType.next();
        System.out.println(atk);
        getAttackType.close();
    }
}
