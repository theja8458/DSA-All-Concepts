//Write a java program to convert temperature from Fahrenheit to Celsius degree..
import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fehren=sc.nextInt();
        float celsius=(fehren-32)*5/9;
        System.out.println(celsius);
        sc.close();
    }
    
}
