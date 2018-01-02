import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App{
    public static void main(String[] args){
        Integer result;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Player 1: Enter Rock, Paper, or Scissors");
            String input1 = bufferedReader.readLine();
            System.out.println("Player 2: Enter Rock, Paper, or Scissors");
            String input2 = bufferedReader.readLine();
            RockPaperScissors myRockPaperScissors = new RockPaperScissors();
            result = myRockPaperScissors.evaluateCombination(input1, input2);
            if (result == 0) {
                System.out.println("Player 2 wins!");
            } else if (result == 1) {
                System.out.println("Player 1 wins!");
            } else if (result == 2) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Please enter Rock, Paper, or Scissors");
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
