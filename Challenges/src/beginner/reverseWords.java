package beginner;

import java.util.Scanner;

public class reverseWords {

    public static void main(String[] args){
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Reversing your text...");
        System.out.println(reverseString(text));
    }

    public static String reverseString(String text){

        StringBuilder reversedText = new StringBuilder();

        // text.length() - 1 gives the last index of the string's characters
        // the for loop will end when the index gets to the starting index
        // after each loop, the index will decrease

        for(int i = text.length() - 1; i >= 0; i--){
            reversedText.append(text.charAt(i));
        }
        return reversedText.toString();
    }

}
