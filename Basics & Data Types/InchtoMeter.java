//Write a java program that reads number in inches and converts it to meters......

import java.util.*;
public class InchtoMeter {
    public static void main(String arhs[]){
        Scanner sc=new Scanner(System.in);
        float inch=sc.nextFloat();
        float meter=inch/39.37f;
        System.out.println(meter);
    }
    
}
