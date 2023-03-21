public class putallxtolast{

    public static void putallxToLast(String str,int index,String newstr1,String newstr2){
        if(index==str.length()-1){
System.out.println(newstr1+newstr2);
            return;
        }
        char curr=str.charAt(index);
        if(curr=='x'){
newstr2+=curr;
putallxToLast(str, index+1, newstr1, newstr2);
        }
        else{
            putallxToLast(str, index+1, newstr1+curr, newstr2);
        }
    }
    public static void main(String[] args) {
        putallxToLast("axbcxd", 0, "", "");
    }
}