import java.util.Scanner;
public class Rock{
    private static String p1;
    private static String p2;

    public static String newGame(){
        Scanner p1s = new Scanner(System.in);Scanner p2s = new Scanner(System.in);
        System.out.println("Player 1 select\n 1) rock\n 2) paper\n 3) scissors");
        p1 = p1s.nextLine();
        System.out.println("Player 2 select\n 1) rock\n 2) paper\n 3) scissors");
        p2 = p2s.nextLine();
        if(p1 == "1" && p2 == "3" || p1 == "2" && p2 == "1" || p1 == "3" && p2 == "2"){
            return "Player 1";
        }
        else{
            return "Player 2";
        }
    }
    public static void main(String[] args) {
        System.out.println(newGame()+" won!");
    }   
}