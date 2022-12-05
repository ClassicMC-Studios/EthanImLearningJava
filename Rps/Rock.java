import java.util.Scanner;
public class Rock{
    private static String p1,p2,p1c,p2c,won;
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
     }
    public static String newGame(){
        Scanner p1s = new Scanner(System.in);Scanner p2s = new Scanner(System.in);
        System.out.println("Player 1 select\n 1) rock\n 2) paper\n 3) scissors");
        p1 = p1s.nextLine();
        if (p1.equals("1")){
            p1c = "Rock";
        }else if(p1.equals("2")){
            p1c = "Paper";
        }else if(p1.equals("3")){
            p1c = "Scissors";
        }
        clearScreen(); 
        System.out.println("Player 2 select\n 1) rock\n 2) paper\n 3) scissors");
        p2 = p2s.nextLine();
        if (p2.equals("1")){
            p2c = "Rock";
        }else if(p2.equals("2")){
            p2c = "Paper";
        }else if(p2.equals("3")){
            p2c = "Scissors";
        }
        clearScreen(); 
        p1s.close();p2s.close();
        if(p1.equals("1") && p2.equals("3") || p1.equals("2") && p2.equals("1") || p1.equals("3") && p2.equals("2")){
            won = p1c;
            return "Player 1";
        }
        else if(p2.equals("1") && p1.equals("3") || p2.equals("2") && p1.equals("1") || p2.equals("3") && p1.equals("2")){
            won = p2c;
            return "Player 2";
        }
        else{
            won = "Nothin\'";
            return "Ya'll drawed";
        }

    }
    public static void main(String[] args) {
        System.out.println(newGame()+" won with "+won+"!");
    }   
}