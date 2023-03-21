public class nqueenpace{
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];

        //create a board

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
board[i][j]='_';
            }
        }

        nqueen(board, 0);

    }
//nqueen place in board with one queen in one row without chess rules
public static void nqueen(char board[][],int row){
    if(row==board.length){
        printboard(board);
        return;
    }

    for(int colom=0;colom<board[row].length;colom++){
        board[row][colom]='Q';
        nqueen(board, row+1);
        board[row][colom]='_';
    }
}


    //print baord fuction
    public static void printboard(char board[][]){
        System.out.println("______________________________________________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}