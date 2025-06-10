public class Permutations {
    static void permutations(String str,String ans){
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

       for(int j=0 ; j<str.length() ; j++){
       char cur = str.charAt(j);
       String newStr =  str.substring(0, j)+str.substring(j+1);
        permutations(newStr, ans+cur);
       }
    }
 public static void main(String[] args) {
    permutations("abc", "");
 }   
}
