/* Marcelo Napoleao Sampaio - Assignment 1 CMPT 305
DATE: 24/02/2021
190002
*/
import java.lang.Object;
import java.util.Scanner;
import java.lang.*;
import javax.swing.*;

/**
*This class is part of a hangman game in java. It handles the drawing of the different stages of
*the hangman itself and keeps track of the state of the hangman and wether it is alive or dead.
*@author Marcelo Sampaio
*/
public class Gallows

{
//variable for the number of incorrect guesses
  private int incGuesses = 0;

//array holding the different stages of the ascii drawing in order.
  private String[] drawings = {
  " _________ \n" +
  "|         | \n" +
  "|          \n" +
  "|         \n" +
  "|          \n"+
  "|          \n"+
  "| \n" +
  "|",
  " _________ \n" +
  "|         | \n" +
  "|        O \n" +
  "|           \n" +
  "|          \n"+
  "|          \n"+
  "| \n" +
  "|",
  " _________ \n" +
  "|         | \n" +
  "|        O \n" +
  "|         | \n" +
  "|         | \n" +
  "|          \n"+
  "| \n" +
  "|",
  " _________ \n" +
  "|         | \n" +
  "|        O \n" +
  "|       / | \n" +
  "|         | \n" +
  "|          \n"+
  "| \n" +
  "|",
  " _________ \n" +
  "|         | \n" +
  "|        O \n" +
  "|       / | \\ \n" +
  "|         | \n" +
  "|          \n"+
  "| \n" +
  "|",
  " _________ \n" +
  "|         | \n" +
  "|        O \n" +
  "|       / | \\ \n" +
  "|         | \n" +
  "|       /   \n"+
  "| \n" +
  "|",
  " _________ \n" +
  "|         | \n" +
  "|        O \n" +
  "|       / | \\ \n" +
  "|         | \n" +
  "|       /   \\ \n"+
  "| \n" +
  "|"};

  /**
  *Method used to increment the hangman if the user guessed a wrong word.
  *
  *
  *
  */
  public void incrementHangman(){
      incGuesses++;
  }

  /**
  *Method used to check if the player has lost the game.
  *
  *
  *@return returns wether our hangman has died as a true or false
  */
  public boolean isDead(){
    if(incGuesses < 7){
        return false;
    }
    return true;
  }
  /**
  *Method used to display the hangman drawing at its current stage
  *
  *
  *@return return an ascii drawing of the current stage of the hangman game which
  * is stored in an array containing all the drawings.
  */
  public String toString(){
    return drawings[incGuesses];
  }

}
