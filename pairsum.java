
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.text.AbstractDocument.BranchElement;

public class pairsum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
    
        list.add(8);
        list.add(9);
        list.add(10);

       boolean b=parisum(list, 16);
       System.out.println(b);
    }

    //more better aproach
    /*
    public static void pairSum(ArrayList<Integer> list,int Target){
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)+list.get(j)==Target){
                    System.out.println(list.get(i)+"  +  "+list.get(j));
                }
            }
        }
    }
    */

   /* public static boolean pairsum(ArrayList<Integer> list,int target){
        int leftpo=0;
        int rightpo=list.size()-1;

        while(leftpo!=rightpo){
            if(list.get(leftpo)+list.get(rightpo)==target){
                System.out.println(list.get(leftpo)+"  +  "+list.get(rightpo));
               return true;
               
            }
else
            if(list.get(leftpo)+list.get(rightpo)<target){
                leftpo++;
            }
            else {
                rightpo--;
            }
        }
        return false;
    }
    */

    //pair sum using 2 pointer in sorted rotated arraylist  to hit the target

    // [11,15,6,8,9,10]     original list=[6,8,9,10,11,15]  it is rotated from 10
//target =16

public static boolean parisum(ArrayList<Integer> list,int target){
int n=list.size();

int breakpoint=-1;

for(int i=0;i<list.size();i++){
    if(list.get(i)>list.get(i+1)){
        breakpoint=i;
           break;
    }
}
    int leftpo=breakpoint+1;
int rightpo=breakpoint;

while(leftpo!=rightpo){
    if(list.get(leftpo)+list.get(rightpo)==target){
        return true;
    }
    else if(list.get(leftpo)+list.get(rightpo)<target){
        leftpo=(leftpo+1)%n;
    }
    else{
        rightpo=(n+rightpo-1)%n;
    }

}
  return false;
}
    }

