import java.util.Scanner;

public class mytictactoegame {
    public static void main(String[] args) {
        mytictactoegame v=new mytictactoegame();
      v.play();
    }

    private char board[][];
    private char currentPlayer;

    public mytictactoegame(){
        board=new char[3][3];
        currentPlayer='X';
        intializingboard();

    }

    //intializing the board with '-'
public void intializingboard(){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            board[i][j]='-';
        }
    }
}


//create a structure of board
public void createBoard(){
    System.out.println("-------------");
    for(int i=0;i<3;i++){
        System.out.print("| ");
        for(int j=0;j<3;j++){
            System.out.print(board[i][j]+" | ");
        }
        System.out.println();
        System.out.println("-------------");
    }
}


//winning condition
public boolean winningCondition(char c1,char c2,char c3){
   return((c1!='-') && (c1==c2) && (c2==c3));
}

private boolean won(){
    return(checkrow()|| checkcolom() || checkdiagonal());
}


public boolean checkrow(){
    for(int i=0;i<3;i++){
       if( winningCondition(board[i][0], board[i][1], board[i][2])){
        return true;
       }
    }
    return false;

}

public boolean checkcolom(){
    for(int i=0;i<3;i++){
        if(winningCondition(board[0][i], board[1][i], board[2][i])){
            return true;
        }
    }
    return false;
}

public boolean checkdiagonal(){
    return winningCondition(board[0][0], board[1][1], board[2][2]) || winningCondition(board[0][2], board[1][1], board[2][0]) ;
}


public void play(){
    int count=0;
    boolean playing=true;
    while(playing){
        createBoard();
        int move[]=getmove();
        if(board[move[0]][move[1]]=='-'){
            count++;
        board[move[0]][move[1]]=currentPlayer;
        }
        else{
            currentPlayer= currentPlayer=(currentPlayer=='X')?'O':'X';
        }
        if(won()){
            createBoard();
            System.out.println("player is win = "+currentPlayer);
            playing=false;
        }
        else if(count>=9){
            System.out.println(" game is drawn");
        }
        else{
            currentPlayer=(currentPlayer=='X')?'O':'X';
        }
        

        
    }
}

public int[] getmove(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter row (0-2)");
    int row=sc.nextInt();
    System.out.println("enter colom (0-2)");
    int colom=sc.nextInt();
    return new int[]{row,colom};

}
}
