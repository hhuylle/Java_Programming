package WednesdayLiveSession.Week9;

import java.util.Arrays;

public class T1TicTacToe {
    /*

     */
    public static void main(String[] args) {

        char[][] board = { {'-','X','O'},
                           {'-','X','X'},
                           {'O','X','-'}, };

        /*
            3 ways to win:
                same characters ( x or o )
                    in a row/ colum/ diagnose
                for - each 1D array
                    row: check each array board
         */
        String winner = "";

        for (int i = 0; i < board.length; i++) {
            String row = Arrays.toString(board[i]);
            String colum = ""+board[0][i]+board[1][i]+board[2][i];//.replace(", ","").replace("[","").replace("]",""): to remove [] and ", "

            if (row.equals("XXX") || colum.equals("XXX")){
                winner = "X";
            } else if (row.equals("OOO") || colum.equals("OOO")) {
                winner = "O";
            }
        }

        String diag1 = ""+board[0][0]+board[1][1]+board[2][2];
        String diag2 = ""+board[0][2]+board[1][1]+board[2][0];

        if (diag1.equals("XXX") || diag2.equals("XXX")){
            winner = "X";
        } else if (diag1.equals("OOO") || diag2.equals("OOO")) {
            winner = "O";
        }

        if (winner.isEmpty()){
            System.out.println("Tie");
        }else {
            System.out.println(winner+" player wins");
        }

    }

}
