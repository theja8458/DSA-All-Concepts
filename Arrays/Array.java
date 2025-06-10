import java.util.*;

 public class Array {
 
    public static void main(String args[]){
        // int marks[]=new int[50];

        // int numbers[]={1,2,3};
        // String fruits[]={"Apple","Mango","Banana"};
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt(); 
        marks[2]=sc.nextInt();
        System.out.println("Phy :"+marks[0]);
        System.out.println("Maths :"+marks[1]);
        System.out.println("Social :"+marks[2]);
        marks[2]=100;
        System.out.println("Social :"+marks[2]);
    }
 }