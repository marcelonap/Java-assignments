/* Marcelo Napoleao Sampaio - Lab1 CMPT 305
DATE: 26/01/2021
Part2
*/
import java.lang.Object;
import java.util.Scanner;
import java.util.Random;
/**
* This class will request an integer input from the user and compare it to a randomly generated number from 1-10 and inform if the user guessed the number correctly
*@author Marcelo Sampaio
*/
public class Part2
{
  /**
  * Main method runs the program
  * @param args User input string which will determine how many times the user will be prompted for input
  */
  public static void main(String[] args)
  {
      if(args.length == 0){ //checking if there was no user input and exiting the program if so
        System.out.println("No user input");
        System.exit(1);
      }
      String s = args[0];   //storing user input
      int j = 0;
      //converting the input to integer
      try{
          j = Integer.parseInt(s);
      }
      catch(Exception e){

      }

      Scanner input = new Scanner(System.in);//creating scanner object
      Random myGen = new Random();//creating random object which is the random number generator
        for(int i = 0; i < j ; i++){
          System.out.print("Pick a number between 1-10: "); //prompting user for input
          String output = " ";
          output = input.nextLine(); //storing user input from scanner object
          int user = 0;
          // converting input to integer
          try{
              user = Integer.parseInt(output);
          }
          catch(Exception e){
            }

          if(user == 0){//default message if input is not valid and continues to the next iteration of the loop
              System.out.println("That is not a valid number");
              continue;
          }

          int chosen = 0;
              while(true){//loops to garantee that the random number is not 0
                //this loop will end once the random number chosen is not equal to 0.
               chosen = myGen.nextInt(11);
               if(chosen != 0){
                 break;
               }
             }
             //checks user onput against chosen value and displays result message
          if(user == chosen){
            System.out.println("You have guessed correct");
          }else{
              System.out.println("You have guessed incorrect");
          }
        }

  }
}
