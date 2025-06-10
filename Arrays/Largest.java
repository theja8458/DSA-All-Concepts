public class Largest {

    public static int LargeEleInArray(int numbers[]){
    int Largest=Integer.MIN_VALUE;
    int smalest=Integer.MAX_VALUE;
    for(int i=0 ; i<numbers.length ; i++){
        if(Largest<numbers[i]){
            Largest=numbers[i];
        }
        if(smalest>numbers[i]){
            smalest=numbers[i];
        }
        
    }
    System.out.println("smallest value is "+smalest);
    return Largest;
}

public static void main(String args[]){
    int numbers[]={1,2,6,3,5};
    System.out.println(LargeEleInArray(numbers));
}
}
