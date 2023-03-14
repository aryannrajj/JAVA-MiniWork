import javax.lang.model.util.ElementScanner14;
import java.util.*;
public class TickTacToe {
    public static void grid(String[][] table)
    {
        for(int x=0; x<3; x++)
        {
            for(int y=0;y<3;y++){
                System.out.print(" ");
                System.out.print(table[x][y]);
                System.out.print(" |");
            }
            System.out.println();
            System.out.println("-----+-----+-----");
        }
    }
    public static String player(String[][] table){
        System.out.print(" \nEnter a valid empty place for your move(a-i): ");
        Scanner sc = new Scanner(System.in);
        String place = sc.next();
        
        switch(place){
            case "a": if(table[0][0].equals(" "))
                         return table[0][0] = "X";
                      else
                         return player(table);
            case "b": if(table[0][1].equals(" "))
                         return table[0][1] = "X";
                      else
                         return player(table);
            case "c": if(table[0][2].equals(" "))
                         return table[0][2] = "X";
                      else
                         return player(table);
            case "d": if(table[1][0].equals(" "))
                         return table[1][0] = "X";
                      else
                         return player(table);
            case "e": if(table[1][1].equals(" "))
                         return table[1][1] = "X";
                      else
                         return player(table);
            case "f": if(table[1][2].equals(" "))
                         return table[1][2] = "X";
                      else
                         return player(table);
            case "g": if(table[2][0].equals(" "))
                         return table[2][0] = "X";
                      else
                         return player(table);
            case "h": if(table[2][1].equals(" "))
                         return table[2][1] = "X";
                      else
                         return player(table);
            case "i": if(table[2][2].equals(" "))
                         return table[2][2] = "X";
                      else
                         return player(table);
            default: return player(table);
        }
    }

    public static String computer(String[][] table){
        int x = (int)(9*Math.random() + 1);
        switch(x){
            case 1: if(table[0][0].equals(" "))
                         return table[0][0] = "O";
                      else
                         return computer(table);
            case 2: if(table[0][1].equals(" "))
                         return table[0][1] = "O";
                      else
                         return computer(table);
            case 3: if(table[0][2].equals(" "))
                         return table[0][2] = "O";
                      else
                         return computer(table);
            case 4: if(table[1][0].equals(" "))
                         return table[1][0] = "O";
                      else
                         return computer(table);
            case 5: if(table[1][1].equals(" "))
                         return table[1][1] = "O";
                      else
                         return computer(table);
            case 6: if(table[1][2].equals(" "))
                         return table[1][2] = "O";
                      else
                         return computer(table);
            case 7: if(table[2][0].equals(" "))
                         return table[2][0] = "O";
                      else
                         return computer(table);
            case 8: if(table[2][1].equals(" "))
                         return table[2][1] = "O";
                      else
                         return computer(table);
            case 9: if(table[2][2].equals(" "))
                         return table[2][2] = "O";
                      else
                         return computer(table);            
        }
       return null; 
    }

    public static void game(String[][] table){
        boolean result = false;
        for (int j=0;j<4;j++){
            player(table);
            grid(table);
           if(table[0][0].equals("X") && table[0][1].equals("X") && table[0][2].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            }  
            if(table[1][0].equals("X") && table[1][1].equals("X") && table[1][2].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            }  
            if(table[2][0].equals("X") && table[2][1].equals("X") && table[2][2].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            }  
            if(table[0][0].equals("X") && table[1][0].equals("X") && table[2][0].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            }  
            if(table[0][1].equals("X") && table[1][1].equals("X") && table[2][1].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            }  
            if(table[0][2].equals("X") && table[1][2].equals("X") && table[2][2].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            } 
            if(table[0][0].equals("X") && table[1][1].equals("X") && table[2][2].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            } 
            if(table[0][2].equals("X") && table[1][1].equals("X") && table[2][0].equals("X"))
            {
                System.out.println("\nYou Win..!! ");
                result = true;
                break;
            } 
            

            System.out.println("\nComputer's Turn\n");
            computer(table);
            grid(table);
            if(table[0][0].equals("O") && table[0][1].equals("O") && table[0][2].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            }  
            if(table[1][0].equals("O") && table[1][1].equals("O") && table[1][2].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            }  
            if(table[2][0].equals("O") && table[2][1].equals("O") && table[2][2].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            }  
            if(table[0][0].equals("O") && table[1][0].equals("O") && table[2][0].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            }  
            if(table[0][1].equals("O") && table[1][1].equals("O") && table[2][1].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            }  
            if(table[0][2].equals("O") && table[1][2].equals("O") && table[2][2].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            } 
            if(table[0][0].equals("O") && table[1][1].equals("O") && table[2][2].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            } 
            if(table[0][2].equals("O") && table[1][1].equals("O") && table[2][0].equals("O"))
            {
                System.out.println("\nYou Lose..!! ");
                result = true;
                break;
            } 
        }
    }
    public static void main(String[] args){
        String[][] table = new String[3][3];
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                table[x][y] =" ";
            }
        }
        grid(table);
        game(table);
    }
}
