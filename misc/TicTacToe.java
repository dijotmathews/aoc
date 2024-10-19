import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {

    static char[][] board = {{' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '}};

    static void drawBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean has_won(char[][] board, char player) {
         for(int i = 0; i < 3; i++){
             if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == player) {
                 return true;
             }
         }

        for(int j = 0; j < 3; j++){
            if (board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[0][j] == player) {
                return true;
            }
        }

        if(board[1][1] ==  board[2][2] && board[1][1] ==  board[0][0] && board[1][1] == player) {
            return true;
        }

        if(board[0][2] ==  board[1][1] && board[0][2] ==  board[2][0] &&  board[0][2] == player) {
            return true;
        }

        return false;
    }

    public static void main(String ...args) throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        boolean game_over = false;
        char player = '*';

        while(!game_over) {
            drawBoard();
            System.out.print("Enter the next move Eg, 2,2 for player "+ player+ " : ");
            String inp = bfn.readLine();
            String[] location = inp.split(",");
            int row = Integer.parseInt(location[0]);
            int col = Integer.parseInt(location[1]);
            board[row][col] =  player;
            game_over = has_won(board, player);

            if(game_over)
                System.out.println(player + " has won!!");
            player = player == '*' ? 'o' : '*';
        }

        System.out.println("hello from scratch");
    }
}
