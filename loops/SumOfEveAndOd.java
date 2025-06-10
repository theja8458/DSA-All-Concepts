import java.util.Scanner;
public class SumOfEveAndOd {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int EvenSum=0;
    int OddSum=0;
    int num;
    int choice;
    do{
        System.out.println("Enetr the number");
        num=sc.nextInt();
        if(num%2==0){
            EvenSum+=num;
        }
        else{
            OddSum+=num;
        }
        System.out.println("do you want to continue click on 1 for yes 0 for no");
        choice=sc.nextInt();
    }while(choice==1);

    System.out.println("Sum of even number = "+EvenSum);
    System.out.println("Sum of Odd number = "+OddSum);
}
}
//     for(int i=1 ; i<=20 ;i++){
//         if(i%2==0){
//             EvenSum+=i;
//         }
//         else{
//             OddSum+=i;
//         }
//     }
//     System.out.println("Sum of even number = "+EvenSum);
//     System.out.println("Sum of Odd number = "+OddSum);
//    }
    

