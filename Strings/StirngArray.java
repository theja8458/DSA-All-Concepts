import java.util.Scanner;
class StringArray{
    public static void printstring(String str){
        for(int i=0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
        String str1[]={"abcd"};
         String str2=new String("xyz");
       Scanner sc=new Scanner(System.in);
       String name;
    //    name=sc.nextLine();
    //    System.out.println(name);
       String Movie="Deadpool & wolverine";
       System.out.println(Movie.length());
       String firstname="Tony";
       String lastname="Stark";
       String fullname=firstname+" "+lastname;
       System.out.println(fullname);
       printstring(fullname);

    }
}