import java.util.Scanner;

public class IAmCode {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("WEEK 10 - Lab 7");

        System.out.println("Please enter sentences, . to end.");

        String resultSentence = "The qualities are ";

        String inputSentence = keyboard.nextLine();

        while (!inputSentence.equals(".")) {

            if(inputSentence.startsWith("I am")) {

               resultSentence = resultSentence + inputSentence.substring(5);
               
            }

            inputSentence = keyboard.nextLine();


        }//end of while loop

        System.out.println(resultSentence);

    }//end of main method

}//end of IAmCode class
