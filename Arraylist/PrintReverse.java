import java.util.ArrayList;
public class PrintReverse {

    public static  void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(6);
    list.add(8);
    int maxele=Integer.MIN_VALUE;
     System.out.println(list);
    for(int i=list.size()-1 ; i>=0 ; i--){
        maxele=Math.max(maxele, list.get(i));
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
    
    System.out.println("Max Elemet = "+maxele);
}
    
}
