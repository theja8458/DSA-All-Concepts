public class Palindrome {
    static boolean checkpalind(String str,int i){
        if(i>str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return checkpalind(str, i+1);
        
    }
    public static void main(String args[]){
        String str = "racecarr";
        System.out.println(checkpalind(str,0));
    }
}
