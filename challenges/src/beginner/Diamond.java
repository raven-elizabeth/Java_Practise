// Create a diamond, like so:
//    A
//   B B
//  C   C
// D     D
//E       E
// D     D
//  C   C
//   B B
//    A
// Allow the user to choose a letter in the alphabet to determine the size of the diamond.


package beginner;
import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) throws Exception {
        System.out.println(buildDiamond(getUserLetter()));
    }

    private static String buildRow(String data, char userChoice, int currentIndex){

        // Initialise string builder for row
        StringBuilder row = new StringBuilder();

        // Get index of last element in data
        int lastIndex = data.indexOf(userChoice);

        // Add initial spaces for row
        row.append(" ".repeat(lastIndex - currentIndex));

        // Add letter
        row.append(data.charAt(currentIndex));

        // If current index is not the start...
        if(currentIndex != 0){

            // Add spaces in-between: (n*2) - 1
            row.append(" ".repeat((currentIndex * 2) - 1));

            // Add letter again
            row.append(data.charAt(currentIndex));
        }

        // Always add new line for next row
        row.append("\n");

        return row.toString();
    }

    public static String buildDiamond(char letter){

        // If 'A' selected, return early
        if(letter == 'A'){
            return "A";
        }

        // Initialise alphabet variable & get final index
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int lastIndex = alphabet.indexOf(letter);

        // Initialise string builder
        StringBuilder diamond = new StringBuilder();

        // Top half of diamond: for loop to add letters and spaces for each row
        for(int i = 0; i <= lastIndex; i++){
            String row = buildRow(alphabet, letter, i);
            diamond.append(row);
        }

        // Bottom half of diamond: for loop to again add all letters but backwards from last letter
        for(int i = lastIndex - 1; i >= 0; i--){
            String row = buildRow(alphabet, letter, i);
            diamond.append(row);
        }

        return diamond.toString();
    }

    // Get letter from user
    public static char getUserLetter() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");

        char letter = Character.toUpperCase(scanner.next().charAt(0));
        validateInput(letter);

        scanner.close();
        return letter;
    }

    public static void validateInput(char input) throws Exception {
        if(!Character.isAlphabetic(input)){
            throw new Exception("Invalid input");
        }
    }
}


// LEFT TO DO
// Create bottom half: when index is halfway through rounded up for odd numbers, halfway through + next for even - flip pattern