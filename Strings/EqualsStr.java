public class EqualsStr {

    public static void main(String args[]){
        String str1="tony";
        String str2="tony";
        String str3=new String("tony");

        if(str1 == str2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
    
}
