package fp1;
import java.util.Scanner;

public class Player {
    public static String name;
    public static int health = (int)(Math.random()*100)+100;
    public static void debug(String text){
        System.out.println(text);
    }
    public void init(){
        debug("What is your name?");
        Scanner getName = new Scanner(System.in);
        name = getName.next();
        getName.close();
    }
}
