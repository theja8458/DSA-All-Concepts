//Find area of square....

import java.util.Scanner;
class AreaOfSquare{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int side=sc.nextInt();
    int square=side*side;
    System.out.println("The area of square = "+square);
    sc.close();
}
}