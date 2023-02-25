
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        // create a new Scanner object to read  input from the console
        Scanner input = new Scanner(System.in);
        
        // create a string variable containing the mad libs story template with placeholder
        String madLibs = "One day, [name] decided to take a walk in the [adjective1] park. \n" +
            "They came across a [adjective2] [noun1] who was in trouble. \n" +
            "The [noun1] asked for [name]'s help to find their lost [noun2].\n" +
            "\n" +
            "Without hesitation, [name] agreed to help. \n" +
            "They searched high and low, and finally found the [noun2] hidden in a [adjective3] book. \n" +
            "The grateful [noun1] thanked [name] and gave them a '[adjective4]' [noun4] as a reward.\n" +
            "\n" +
            "Feeling [adjective5], [name] continued their walk and came across a [adjective6] [noun5]. \n" +
            "They [verb1] on the [noun5] for a while, enjoying the [adjective7] scenery. \n" +
            "As the sun began to set, [name] realized it was time to head back home.\n" +
            "\n" +
            "They [verb2] back to their [noun6], feeling [adjective8] about their adventure and the new [noun4] they had received.\n" +
            "From that day on, [name] couldn't help but smile whenever they thought about their [adjective9] day in the park.";
        
        int index = 0; // track the position in the madLibs string
        
        String userInput = ""; // stores user's entered words
        
        String usedWords = ""; // keeps track of placeholders that have already been filled in
        
        // Loop through the madLibs string untill all placeholders have been filled in
        while (index < madLibs.length()) {
            int startIndex = madLibs.indexOf('[', index);// to find the start of placeholder i.e ([)
            // if an  opening bracket is found, then look for the closing bracket (])
            if (startIndex != -1) {
                
                int endIndex = madLibs.indexOf(']', startIndex); // to find the end of the placeholder i.e
                // if a closing bracket is found, extract the placeholder word between the brackets
                if (endIndex != -1) {
                    String word = madLibs.substring(startIndex + 1, endIndex); // to extract word from the placeholder
                    
                    if (usedWords.contains(word)){ // checks if the word has already been used
                        userInput += word; // if already given, add it to user input
                        
                    } else {
                        System.out.print("Please enter a " + word + ": "); // prompt the user for input
                        String inputStr = input.nextLine();  // read user input
                        
                        if (inputStr.isEmpty()) {
                            System.out.println("Input cannot be empty. Please enter a valid input."); // check for empty  input 
                            continue;
                        }
                        
                        
                        userInput += inputStr; // store user input in the userInput string
                        usedWords += word; // add the word to the useWord string
                        madLibs = madLibs.replace("[" + word + "]", inputStr); // replace the placeholder in the madLibs string with the user input
                    }
                    index = endIndex + 1;  // move the index past the end of the placeholder
                    } else {
                    break;
                }
            } else {
                userInput += madLibs.substring(index); // add any remaining text to the userInput string
                break;
            }
        }

        System.out.println(madLibs); // print out the final story with the user's inputs filled in
    }
}
