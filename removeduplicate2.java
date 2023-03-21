public class removeduplicate2 {

    public static void removeduplicate(String str,int index,String newstr){
        boolean arr[]=new boolean[str.length()-1];
        if(index==str.length()-1){
            System.out.println(newstr);
            return;
        }

    char curr=str.charAt(index);
    arr[curr]=true;
    removeduplicate(str, index+1, newstr+curr);


    if(arr[curr]==false){
        arr[curr]=true;
       
    }else{
    
    removeduplicate(str, index+1, newstr);
}

    }
    public static void main(String[] args) {
        removeduplicate("abaaccd", 0, "");
    }
}
