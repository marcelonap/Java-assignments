/* Marcelo Napoleao Sampaio - Assignment 2 CMPT 305
DATE: 22/03/2021
190002
*/
import java.lang.Math;

public class RandomPlayer extends Player{

  /**
  *Constructor method, calls constructor from Player class.
  *
  *@param type - char 'X' or 'O'
  */
  public RandomPlayer(char type){  super(type);  }

  /**
  *gettype method to access the type of the player
  *
  *@return returns a character containing the object's type
  */
  public char getType(){ return type; }

  /**
  *getmove method to generate a move for the randomized player.
  *This method checks if the randomly generated position is available then
  *returns that valid movement in a Move object
  *@param board - Board where the game is being played.
  *@return returns a Move object containing the player's movement
  */
  public Move getMove(Board board){

    Move move;
    int firstArg;
    int second;
    boolean invalid = true;

    while(true){
        firstArg = (int)(Math.random() *board.getRows());
        second = (int)(Math.random() *board.getColumns());
        if(board.getPlayerAtLocation(firstArg,second) == null ){
            move = new Move(firstArg,second);
            return move;
      }
    }

  }
}
