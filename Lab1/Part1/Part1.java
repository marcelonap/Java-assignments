/* Marcelo Napoleao Sampaio - Lab1 CMPT 305
DATE: 26/01/2021
Part1
*/
import java.lang.Object;
import java.util.Scanner;
import java.lang.*;
/**
* This class will request an input from the user and evaluate that input to see if its lowercase uppercase or a number
*@author Marcelo Sampaio
*/
public class Part1
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

          Scanner input = new Scanner(System.in); //creating scanner object
          for(int i = 0; i < j ; i++)
          {
                  System.out.print("Please enter a character: "); //prompting user for input
                  String output = " ";
                  output = input.nextLine();  //storing user input from scanner object
                  int test = 0;
                  char c = output.charAt(0); //converting input to char
                  try{
                      test = Integer.parseInt(output);// converting input to integer (if possible)
                  }
                  catch(Exception e){

                  }
                  if(test != 0){//if input is able to be converted to integer it knows its an integer
                    System.out.println("Character '" + output + "' is a number.");
                  }else if(Character.isUpperCase(c) ){//testing for uppercase
                  System.out.println("Character '" + output + "' is uppercase." );
                }else if(Character.isLowerCase(c) ){//testing for lowercase
                  System.out.println("Character '" + output + "' is lowercase." );
                }else {//default message
                  System.out.println("Program does not recognize this character.");
                }
            }
  }
}
