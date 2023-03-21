public class mergesortpla {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        merge(arr, 0, arr.length-1);
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void merge(int arr[],int si,int ei){
      
        if(si>=ei){
            return;
        }

        //find mid
        int mid=si+(ei-si)/2;

        //get left part of mid
        merge(arr, si, mid);
        //get the right part of mid
        merge(arr, mid+1, ei);

        //combine both divided array into sort array
    conquare(arr, si, mid, ei);

    }

    public static void conquare(int arr[],int si,int mid,int ei){
int temp[]=new int[(ei-si)+1];

int i=si;
int j=mid+1;
int k=0;

while(i<=mid && j<=ei){
    if(arr[i]<arr[j]){
        temp[k]=arr[i];
        k++;
        i++;
    }
    else{
        temp[k]=arr[j];
        k++;
        j++;
    }
}


while(i<=mid){
    temp[k]=arr[i];
    k++;
    i++;
}

while(j<=ei){
    temp[k]=arr[j];
    k++;
    j++;

}


//store temp[] into arr[]

for(k=0,i=si;k<temp.length;i++,k++){
    arr[i]=temp[k];
}
    }

   

}
