/* Marcelo Napoleao Sampaio - Assignment 1 CMPT 305
DATE: 24/02/2021
190002
*/
import java.lang.Object;
import java.util.Scanner;
import java.lang.*;
import javax.swing.*;

/**
*This class is responsible for running a hangman game using ur Message and Gallows Classes and JOptionPane messages.
*@author Marcelo Sampaio
*/
public class Hangman
{

  static private Message message = new Message();
  static private Gallows gallows = new Gallows();
  static private boolean run = true;
  /**
  *Method that loops throguh the game for the user.
  *
  */
  public static void interact(){
  String guess = " ";

  int i = 0;

//looping through the game until the user has found the word or hangman has died
       while(!message.solved() && !gallows.isDead()){

//Recording user input and making sure there was an input
       guess = JOptionPane.showInputDialog("Please guess a letter: \n" + message.toString() +  gallows.toString());
       if(guess == null){
           System.exit(1);
         }

      while(guess.length()==0){
        JOptionPane.showMessageDialog(null, "Please enter a letter", "No letter entered", JOptionPane.INFORMATION_MESSAGE);

        guess = JOptionPane.showInputDialog("Please guess a letter: \n" + message.toString() +  gallows.toString());
        if(guess == null){
            System.exit(1);
          }
      }

      //connverting input to char.
       char charGuess = guess.charAt(i);

//Updating game based on a right or wrong guess.
           if(message.guess(charGuess)){
             continue;
           }

           gallows.incrementHangman();

         }

//Handling the end of the game and wether the user wants to play again using a yes or no optionpane
   if(gallows.isDead()){
     int a = JOptionPane.showConfirmDialog(null,"You have lost!\n Want to play again?");


     if(a==JOptionPane.YES_OPTION){

        message = new Message();
        gallows = new Gallows();
     }else {
       System.exit(1);
     }
   }else {
     int a = JOptionPane.showConfirmDialog(null,"You have won!\n Want to play again?");

     if(a==JOptionPane.YES_OPTION){

      message = new Message();
      gallows = new Gallows();
     }else{
       System.exit(1);
     }
   }
 }

 /**
 *Main method used to run our program
 *
 *
 *@param args - args is not used in this program.
 */
    public static void main (String args[])
    {
//looping to make sure the user can choose to play again.
       while(run){
         interact();
       }
      }


}
