/* Marcelo Napoleao Sampaio - Assignment 2 CMPT 305
DATE: 22/03/2021
190002
*/
import javax.swing.*;

/**
*HumanPlayer class,extdnds player class for humans to control in the tic tac toe game.
*
*@author Marcelo Sampaio
*/
public class HumanPlayer extends Player{

  /**
  *Constructor method, calls constructor from Player class.
  *
  *@param type - char 'X' or 'O'
  */
  public HumanPlayer(char type){ super(type); }

  /**
  *gettype method to access the type of the player
  *
  *@return returns a character containing the object's type
  */
  public char getType(){ return type; }

  /**
  *getmove method to get the movement that the player wants to make,
  *This method takes a board object and checks if the player inputed a valid move and continues to
  *prompt the user for a valid position until one is provided
  *@param board - board that the game is being played on
  *@return returns a move object with the player's desired move or null if one wasn't found.
  */
  public Move getMove(Board board){
    String place;
    Move move;
    int firstArg;
    int second;
    boolean invalid = true;

//loop to continue prompting until a valid input is provided
      while(invalid){
         place = JOptionPane.showInputDialog(null,"Input your move: ");
        if(place==null){
          System.exit(1);
        }
        if( place.length()<3  ||place.charAt(1) != ',' ){
          JOptionPane.showMessageDialog(null,"Invalid input, please input a valid move.","Invalid move",JOptionPane.WARNING_MESSAGE);
          continue;
        }

                try {
                    firstArg = Integer.parseInt(String.valueOf(place.charAt(0)));
                    second = Integer.parseInt(String.valueOf(place.charAt(2)));
                    if(firstArg > board.getRows()|| second > board.getColumns()){
                      JOptionPane.showMessageDialog(null,"Invalid input, please input a valid move.","Invalid move",JOptionPane.WARNING_MESSAGE);
                      continue;
                    }
                    if(board.getPlayerAtLocation(firstArg-1,second-1) == null ){
                        move = new Move(firstArg-1,second-1);
                        return move;

                    }else{
                      JOptionPane.showMessageDialog(null,"Invalid input, please input a valid move.","Invalid move",JOptionPane.WARNING_MESSAGE);
                      continue;
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Invalid input, please input a valid move.","Invalid move",JOptionPane.WARNING_MESSAGE);

              }

      }


      return null;

  }


}
