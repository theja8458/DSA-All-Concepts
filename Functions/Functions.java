import java.util.Scanner;
class Solution{
    public static int Calculatesum(int num1, int num2){ //Parameters or formal
        int sum=num1+num2;
        return sum;
    }
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
       System.out.println("a = "+a);
       System.out.println("b = "+b);

    }
    public static void main(String args[]){
        // print();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=Calculatesum(a,b);//arguments or actual
        System.out.println("Sum is : "+sum);
        Swap(a, b);
       
         // public static void print(){
    //     System.out.println("Hellow world!");
    //     System.out.println("Hellow world!");
    //     System.out.println("Hellow world!");
    // }
    // public static void Calculatesum(int a, int b){
    //     int sum=a+b;
    //     System.out.println("Sum = "+sum);
       
    // }
    // public static void main(String args[]){
    //     // print();
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //    Calculatesum(a,b);
        
    }
}