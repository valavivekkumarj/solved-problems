public class removeduplicate {
   public static void main(String[] args) {
    String str="engineering";
    boolean arr[]=new boolean[str.length()];
    remove(str, 0, new StringBuilder(""),arr);
   }
    public static void remove(String str,int index,StringBuilder newstr,boolean arr[]){
        if(index==str.length()){  
System.out.println(newstr);
return;
        }

        char currentchar=str.charAt(index);

        if(arr[currentchar-'a']==true){
            remove(str, index+1, newstr, arr);
        }
else{
    arr[currentchar-'a']=true;
    remove(str, index+1,newstr.append(currentchar), arr);
}
    }

    
}
