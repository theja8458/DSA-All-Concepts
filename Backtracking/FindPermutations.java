public class FindPermutations {
    public static void permu(String str,String ans){
   if(str.length() == 0){
    System.out.println(ans);
    return;
   }

        for(int i=0 ; i<str.length() ; i++){
            char cur=str.charAt(i);
          String  Newstr=str.substring(0, i) + str.substring(i+1);
            permu(Newstr, ans+cur);
        }
    }

    public static void main(String arhgs[]){
        permu("abc","");
    }
}
