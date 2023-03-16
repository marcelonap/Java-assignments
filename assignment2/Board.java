public class Board{

    private Player playerX;
    private Player playerO;
    public Board(Player playerX,Player playerO){
        this.playerX = playerX;
        this.playerO = playerO;

        BoardShow boardShow = new BoardShow(this,"Game 1",playerX,playerO);
    }

    public static void main(String[] args){
      Player playerX = new Player('X');
      Player playerO = new Player('O');
      new Board(playerX,playerO);
    }

    int getRows(){ return 3;}

    int getColumns(){return 3;}

    Player getPlayerAtLocation(int row,int column){
      if(row == 0 && column == 0){
        return playerX;
      }else if(row == 3 && column == 3){
        return playerO;
      }else{
        return null;
      }
    }

    Player win(){return null;}

    boolean tie(){return false;}

    boolean makeMove(int row, int column, Player player){return false;}
}
