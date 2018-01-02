public class RockPaperScissors {
    int result;
    public Integer evaluateCombination(String input1, String input2){

        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();
        if (input1.equals("rock") && input2.equals("scissors")) {
            result = 1;
        } else if (input1.equals("scissors") && input2.equals("rock")) {
            result = 0;
        } else if (input1.equals("paper") && input2.equals("rock")) {
            result = 1;
        } else if (input1.equals("rock") && input2.equals("paper")){
            result = 0;
        } else if (input1.equals("paper") && input2.equals("scissors")) {
            result = 0;
        } else if (input1.equals("scissors") && input2.equals("paper")) {
            result = 1;
        } else if (!input1.equals("paper") && !input1.equals("rock") && !input1.equals("scissors") && !input2.equals("paper") && !input2.equals("rock") && !input2.equals("scissors")) {
            result = 3;
        } else {
            result = 2;
        }
        return result;
    }
}