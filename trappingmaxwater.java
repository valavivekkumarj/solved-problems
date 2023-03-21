import java.util.ArrayList;

public class trappingmaxwater {
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
       height.add(1);
       height.add(8);
      height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
        height.add(8);
       height.add(3);
       height.add(7);

        System.out.println(height);

        System.out.println();
        int a=trapingwater(height);
        System.out.println("maxtrap water = "+a);
    }


    //trapping water brute force
/* 
    public static int trapingwater(ArrayList<Integer> height){
        int maxtrapwater=0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){

                int minheight=Math.min(height.get(i), height.get(j));
                int width=j-i;
int currentwater=minheight*width;
maxtrapwater=Math.max(maxtrapwater,currentwater);
            }
        }
       
        return maxtrapwater;
    }
    */

    //more better aproach with time complexity 0(n)
    public static int trapingwater(ArrayList<Integer> height){
        int leftpo=0;
        int rightpo=height.size()-1;
        int maxwater=0;

        while(leftpo<rightpo){
        int width=rightpo-leftpo;
        int minheight=Math.min(height.get(leftpo), height.get(rightpo));
        int currentwater=minheight*width;
        maxwater=Math.max(maxwater, currentwater);
if(height.get(leftpo)<height.get(rightpo)){
    leftpo++;
}
else{
    rightpo--;
}
      
    }

        return maxwater;
    }
}
