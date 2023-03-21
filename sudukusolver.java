public class sudukusolver {
    public static void main(String[] args) {
        int suduku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        sudukuSolver(suduku, 0, 0);
        printsuduku(suduku);
    }
//print suduku fuction
public static void printsuduku(int suduku[][]){
    for(int i=0;i<suduku.length;i++){
        for(int j=0;j<suduku[i].length;j++){
            System.out.print(suduku[i][j]+"  ");
        }
        System.out.println();
    }
}

    //suduku solver fuction
    public static boolean sudukuSolver(int suduku[][],int row,int col){
        //base case
if(row==9){
    return true;
}

    int nrow=row;
    int ncol=col+1;

    if(col+1==9){
        nrow=row+1;
        ncol=0;
    }

    if(suduku[row][col]!=0){
       return sudukuSolver(suduku, nrow, ncol);
    }

    for(int digit=1;digit<=9;digit++){
    if(issafe(suduku, row, col, digit)){
        suduku[row][col]=digit;
        if(sudukuSolver(suduku, nrow, ncol)){
            return true;
        }
        suduku[row][col]=0;
    }
    }

    return false;
    }

    //is safe fuction
    public static boolean issafe(int suduku[][],int row,int col,int digit){
        //check for row
        for(int i=0;i<9;i++){
            if(suduku[i][col]==digit){
                return false;
            }
        }

        //check for colom
        for(int j=0;j<9;j++){
            if(suduku[row][j]==digit){
                return false;
            }
        }

        //check in grid

        int startrow=(row/3)*3;
        int startcol=(col/3)*3;

        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(suduku[i][j]==digit){
                   return false;
                }
            }
        }
        return true;
    }
}
