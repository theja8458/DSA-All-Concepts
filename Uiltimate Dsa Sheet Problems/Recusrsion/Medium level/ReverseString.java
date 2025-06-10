public class ReverseString {
    static String rev(String str){
       if(str == null || str.length() <=1){
        return str;
       }

       return rev(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(rev("Theja"));
    }
}
