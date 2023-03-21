public class totalgridways {

    //grid ways fing 
    public static int gridways(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else  if(i==n || j==m){
            return 0;
        }

        int waysofright=gridways(i, j+1, n, m);
        int waysofleft=gridways(i+1, j, n, m);

        int totalways=waysofleft+waysofright;
        return totalways;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int a=gridways(0, 0, n, m);
        System.out.println(a);


    }
}
