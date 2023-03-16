/* Marcelo Napoleao Sampaio - Assignment 2 CMPT 305
DATE: 22/03/2021
190002
*/

/**
*Player class for the tictactoe game.
*
*@author Marcelo Sampaio
*/
public abstract class Player{

    char type;
    /**
    *Constructor method, sets the type of the object (X or O)
    *
    *@param type - char 'X' or 'O'
    */
    public Player(char type){  this.type = type;  }

    /**
    *gettype method to access the type of the player
    *
    *@return returns a character containing the object's type
    */
    public char getType(){  return type;  }

    /**
    *Placeholder getMove method which is implemented in the different player classes  
    *that inherit from player
    *@return returns null
    */
    public Move getMove(Board board){
      return null;
    }
}
