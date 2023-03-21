public class nqueensafeplace {
  
    public static int count=0;
        public static void main(String[] args) {
            int n=6;
            char board[][]=new char[n][n];
    
         //crete board using 2d array
    
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
    board[i][j]='X';
                }
            }
    
            nqueen(board, 0);
            System.out.println();
            System.out.println("here total ways to solve n queen problem  witn n == "+n +"  , is ==  " +count);
    
        }
    //nqueen place in board with one queen in one row without chess rules
    public static void nqueen(char board[][],int row){
        //base case
        if(row==board.length){
            count++;
            printboard(board);
            return;
        }
    
        //if no queen is palce in same row same colom and diagonal left and right then next queen is palce 
          for(int colom=0;colom<board.length;colom++){
            //is safe calling
            if(issafe(board, row, colom)){
            board[row][colom]='Q';
            nqueen(board, row+1);
            board[row][colom]='X';
            }
        }
    }
    
    //queen is safe or not check fuction

    public static boolean issafe(char board[][],int row,int colom){

        //check vertical up
        for(int i=row-1;i>=0;i--){
if(board[i][colom]=='Q'){
    return false;
}
        }

        //check left diagonal
        for(int i=row-1,j=colom-1;i>=0 && j>=0;i--,j--){
if(board[i][j]=='Q'){
    return false;
}
        }

        //check right diagonal

        for(int i=row-1,j=colom+1;i>=0 && j<board.length;i--,j++){
if(board[i][j]=='Q'){
    return false;
}
        }

        return true;

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

