/* Marcelo Napoleao Sampaio - Assignment 2 CMPT 305
DATE: 22/03/2021
190002
*/

/**
*Move class stores the coordinates for a player's move during the tictactoe game.
*
*@author Marcelo Sampaio
*/
public class Move{

  private int row;
  private int column;

  /**
  *Constructor method, sets the data in the object
  *
  *@param row - integer row position
  *@param column - integer column position
  */
  public Move(int row, int column){
    this.row = row;
    this.column = column;
  }
  /**
  *Getrow method to access the row position of the move
  *
  *@return returns integer with the row position
  */
  int getRow(){return row;}

  /**
  *Getcolumn method to access the column position of the move
  *
  *@return returns integer with the column position
  */
  int getColumn(){return column;}


}
