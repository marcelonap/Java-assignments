/* Marcelo Napoleao Sampaio - Assignment 2 CMPT 305
DATE: 22/03/2021
190002
*/
import javax.swing.*;
/**
*This class is responsible for running a TicTacToe game using multiple other classes
*@author Marcelo Sampaio
*/
public class TicTacToe{

  private Board board;
  private HumanPlayer playerX;
  private RandomPlayer playerO;
  /**
  *Constructor used to initialize our private variables used in the game.
  *@param rows - integer containing the number of rows
  *@param columns - integer containing the number of columns
  */
    public TicTacToe(int rows, int columns){
      playerX = new HumanPlayer('X');
      playerO = new RandomPlayer('O');
      board = new Board(playerX,playerO,rows,columns);
    }

    /**
    *This the main method responsible for running the TicTacToe game until it is finished using the other classes.
    *
    *@param args - number of rows and columns separated by a space
    */
    public static void main(String[] args){
  //default sizes
      int firstArg=3;
      int second=3;

      //recording user input if any and attempting to convert  it to integer
            if (args.length > 0) {
              try {
                  firstArg = Integer.parseInt(args[0]);
                  second = Integer.parseInt(args[1]);
              } catch (NumberFormatException e) {
                  System.err.println("Argument '" + args[0] + "' must be an integer.");
                  System.exit(1);
            }
        }


      TicTacToe game = new TicTacToe(firstArg,second);

            while(game.board.win()==null && game.board.tie() == false){
              //player's move
              Move playerMove = game.playerX.getMove(game.board);
              game.board.makeMove(playerMove.getRow(),playerMove.getColumn(),game.playerX);
              //check status
                if(game.board.win()!= null){
                  JOptionPane.showMessageDialog(null,"Player "+String.valueOf(game.board.win().getType())+" won!","Game over!",JOptionPane.WARNING_MESSAGE);
                  System.exit(1);
                  break;
                }

                    if(game.board.tie()==true){
                     JOptionPane.showMessageDialog(null,"The game ended in a tie!","Invalid move",JOptionPane.WARNING_MESSAGE);
                     System.exit(1);

                    }
                //computer's move
              Move randomMove = game.playerO.getMove(game.board);
              game.board.makeMove(randomMove.getRow(),randomMove.getColumn(),game.playerO);

              //check status
                  if(game.board.win()!= null){
                    JOptionPane.showMessageDialog(null,"Player "+String.valueOf(game.board.win().getType())+" won!","Game over!",JOptionPane.WARNING_MESSAGE);
                    System.exit(1);
                    break;
                  }

                      if(game.board.tie()==true){
                       JOptionPane.showMessageDialog(null,"The game ended in a tie!","Invalid move",JOptionPane.WARNING_MESSAGE);
                       System.exit(1);

                      }

          }

    }
}
