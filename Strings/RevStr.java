public class RevStr {

    public static String reversestring(String str){
        String revstr="";
        for(int i=str.length()-1 ; i>=0 ; i--){
            revstr+=str.charAt(i);
        }
        if(str.equals(revstr)){
            return "true";
        }
        else{
            return "false";
        }

        // return revstr;
    }


    public static void main(String args[]){
        String str="malayalam";

        System.out.println(reversestring(str));
    }
    
}
