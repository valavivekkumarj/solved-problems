import java.util.Scanner;

public class towerofhanoi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("'enter no of disk");

        int n=sc.nextInt();

towerhanoi(n, "src", "help", "desti");

    }

    public static void towerhanoi(int n,String src,String helper,String desti){
if(n==1){
    System.out.println("Disk"+n+"  transfer ==== "+src+" ===  to === "+desti+" ");
    return;
}

towerhanoi(n-1, src, desti, helper);
System.out.println("Disk"+n+"  transfer ==== "+src+" ===  to === "+desti+" ");
towerhanoi(n-1, helper, src, desti);

    }
}