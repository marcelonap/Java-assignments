/* Marcelo Napoleao Sampaio - Assignment 2 CMPT 305
DATE: 22/03/2021
190002
*/

/**
*This class is responsible for managing the tictactoe board
*@author Marcelo Sampaio
*/
public class Board{

    private Player playerX;
    private Player playerO;
    private int rows;
    private int columns;
    private BoardShow boardShow;
    private char[][] board;
    private int turns = 0;

    /**
    *Constructor method
    *@param playerX - player who will play the letter X
    *@param playerO - player who will play the letter O
    *@param rows - Integer number of rows
    *@param columns - Integer number of columns
    */
    public Board(Player playerX,Player playerO, int rows,int columns){
        this.playerX = playerX;
        this.playerO = playerO;
        this.rows = rows;
        this.columns = columns;
        board = new char[rows][columns];
        boardShow = new BoardShow(this,"Game 1",playerX,playerO);
    }

    /**
    *Getrows method to access the number of rows of the board
    *
    *@return returns an integer number of rows
    */
    int getRows(){ return rows;}
    /**
    *Getcolumns method to access the number of columns of the board
    *
    *@return returns an integer number of columns
    */
    int getColumns(){return columns;}

    /**
    *Getrows method to access the number of rows of the board
    *
    *@param row - Integer row position
    *@param column - Integer column position
    */
    Player getPlayerAtLocation(int row,int column){
        if(board[row][column] == 'X') return playerX;
        else if (board[row][column] == 'O') return playerO;
        else return null;
    }

    /**
    *Method to check if the game has been won.
    *
    *@return returns a reference to the player object who won the game or null if no one has won.
    */
    Player win(){
//-----------------------------------------------------Checking all the rows for a win
            for(int i = 0; i< columns; i++){
              int countX = 0;
              int countO = 0;

              for(int j = 0;j<rows;j++){
                if(board[j][i] == 'X'){
                    countX++;
                }else if(board[j][i] == 'O'){
                    countO++;
                }
              }
              if(countX==rows)return playerX;
              else if(countO==rows)return playerO;
            }
//-----------------------------------------------Checking all the columns for a win
            for(int i = 0; i< rows; i++){
              int countX = 0;
              int countO = 0;
              for(int j = 0;j<columns;j++){
                if(board[i][j] == 'X'){
                    countX++;
                }else if(board[i][j] == 'O'){
                  countO++;
                }
              }
              if(countX==columns)return playerX;
              else if(countO==columns)return playerO;
            }
//only check diagonals if number of rows and columns is equal
//-----------------------------------------------------------checking diagonals for a win
  if(rows == columns){
              int countdX = 0;
              int countdO = 0;
                for(int i = 0; i< columns; i++){

                      if(board[i][i] == 'X'){
                          countdX++;
                      }else if(board[i][i]=='O'){
                        countdO++;
                      }
                  if(countdX==rows)return playerX;
                  else if(countdO==rows)return playerO;
                }
//---------------------------------------------------------
              int countddX = 0;
              int countddO = 0;
              int j = 0;
                for(int i = rows-1; i>=0; i--){

                      if(board[j][i] == 'X'){
                          countddX++;
                      }else if(board[j][i]=='O'){
                        countddO++;
                      }
                      j++;
                  if(countddX==rows)return playerX;
                  else if(countddO==rows)return playerO;
                }
              }
        return null;
      }


      /**
      *Tie method that returns whether the game was tied.
      *
      *@return returns a true if the game is tied, false if it isn't
      */
    boolean tie(){
      if(win() == null && turns >= (rows*columns)) return true;
      return false;
    }

    /**
    *Makemove method, receives a position on the board and a player and checks if the move
    *can be made. if so it returns true and updates the board, if not it returns false and doesn't
    *change anything.
    *@param row - Integer row position
    *@param column - Integer column position
    *@param player - Player object that is making the move
    *@return returns true if the move was possible false if it wasn't
    */
    boolean makeMove(int row, int column, Player player){
        if(board[row][column] == 0){
           board[row][column] = player.getType();
           boardShow.updateBoard(this);
           turns++;
           return true;
        }
        return false;
   }
}
