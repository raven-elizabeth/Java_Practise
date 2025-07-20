package high_card_low_card;

import java.util.Scanner;

public class HighCardLowCard {
    private static int num1;
    private static int num2;
    public static int numberOfCards = 10;

    public static void main(String[] args){
        // Main program calls here
        System.out.println("You are now playing High Card Low Card.");
        if(isRulesNeeded()){
            explainRules();
        }

        setNum1();
        System.out.printf("The first number is: %d.\n", num1);

        String choice = getUserChoice();

        System.out.println("Selecting the next card...");
        setNum2();
        System.out.printf("The second number is %d\n", num2);

        if(isHigherOrLower(choice)){
            System.out.println("Congrats! You win!");
        }
        else{
            System.out.println("Oh no! Better luck next time!");
        }

    }

    private static boolean isRulesNeeded(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need to go through the rules? (y/n)");
        String ans = scanner.next();

        if(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes")){
            return true;
        }
        else if(!ans.equalsIgnoreCase("n") && !ans.equalsIgnoreCase("no")){
            isRulesNeeded();
        }
        return false;
    }

    public static void explainRules(){
        System.out.printf("\nI have one card per number in range 1-%d.\n", numberOfCards);
        String statement =
                """
                I will choose a card.
                Then you will guess if the next card is going to be higher or lower.
                When I draw the next card, we will see if you were right.
                """;
        System.out.println(statement);
    }

    private static void setNum1(){
        num1 = ((int)(Math.random() * (numberOfCards - 1))) + 2;
    }

    private static void setNum2(){
        do {
            num2 = ((int)(Math.random() * numberOfCards)) + 1;
        } while(num2 == num1);
    }

    private static int getHigher(){
        return Math.max(num1, num2);
    }

    public static String getUserChoice(){
        System.out.println("Do you think the next card will be higher or lower?");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();

        while(!ans.equalsIgnoreCase("higher") && !ans.equalsIgnoreCase("lower")){
            System.out.println("You must enter 'higher' or 'lower'.");
            ans = scanner.next();
        }
        scanner.close();
        return ans;
    }

    public static boolean isHigherOrLower(String userChoice){
        if(userChoice.equalsIgnoreCase("higher")){
            return getHigher() == num2;
        }
        else{
            return getHigher() == num1;
        }
    }

}