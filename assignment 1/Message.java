/* Marcelo Napoleao Sampaio - Assignment 1 CMPT 305
DATE: 24/02/2021
190002
*/
import java.lang.Object;
import java.util.Scanner;
import java.lang.*;
import javax.swing.*;
import java.util.Random;

/**
*This class handles the logic of a hangman game in java, it stores the secret words and handles the checking of the guesses
*as well as the solving of the game
*@author Marcelo Sampaio
*/
public class Message{


//Array of words to be used as the secret word in the game.
  private String[] list = {"Programming","Classes","Kings","University","Edmonton","Alberta","Covid","Virus","Bible","Coding","Java","Creativity","Music","God","Jesus","Object","Oriented","Running","Out","Words","Hope","Pass"};

//Variables used throughout the game.
  String secret = "";
  StringBuffer str = new StringBuffer("");

  /**
  * Default constructor initiates the object with an empty address.
  *
  */
  public Message(){
    Random rand = new Random();
//Randomly selecting a word from our list and storing its index.
    int word = rand.nextInt(list.length);
//Storing word chosen randomly.
    secret += list[word];
//for loop to store the initial hidden word with underscores in place of letters and spaces between each letter.
//This is also our output string.
    for(int i = 0; i < (secret.length()*2); i++ ){
      str.insert(i,'_');
      str.insert(i+1,' ');

      i++;
    }
  }

  /**
  *Method used to check if the guessed char is a part of the word to be guessed
  *
  *@param c - Character that the user guessed.
  *@return returns true if the character is guessed corectly and false if it isn't
  */
  public boolean guess(char c){
      int count = 0;
      int j = 0;

            for(int i = 0; i < secret.length(); i++){
//checking each character of our secret word to see if the inputed character is included
              if(c == secret.charAt(i)){
                str.setCharAt(j,c); //updating the output string
                count++;
              }
//Iterating variable j by two to account for the spaces included earlier
              j+=2;
            }
//determining wether this function should return true or false based on wether
//the variable count was iterated which means the guessed letter was a part of the word
        if(count > 0){
          return true;
        }
        return  false;
    }

    /**
    *Method used to check if the word was guessed
    *
    *
    *@return returns true if the word was guessed corectly and false if it hasn't yet
    */
    public boolean solved(){
//looping through our output variable and comparing it to our chosen word
//to see if the user has guessed the whole word yet.
     int j = 0;
       for(int i = 0; i < secret.length(); i++){
      if(str.charAt(j) != secret.charAt(i)){
        return false;
        }
      j+= 2;
    }
      return true;
    }
    /**
    *Method used to output a hidden version of the word with only the guessed letters visible
    *
    *
    *@return returns our output string.
    */
    public String toString(){
        return str.toString() + "\n";
    }
}
