public class PalindromeStr {
    static boolean Check(String str,int st,int end){
        if(st == end){
            return true;
        }
        if(str.charAt(st) != str.charAt(end)){
            return false;
        }

        return Check(str, st+1, end-1);
    }
    public static void main(String[] args) {
        String str = "raacecar";
        System.out.println(Check(str, 0, str.length()-1));
    }
}
