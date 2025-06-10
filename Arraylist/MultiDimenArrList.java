import java.util.ArrayList;
public class MultiDimenArrList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
       for(int i=1 ; i<=5 ; i++){
            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3); //3 6 9 12 15
       }
       mainlist.add(list1);
       mainlist.add(list2);
       mainlist.add(list3);
       System.out.println(mainlist);
       for(int i=0 ; i<mainlist.size() ; i++){
        ArrayList<Integer> curlist=mainlist.get(i);
        for(int j=0 ; j<curlist.size() ; j++){
            System.out.print(curlist.get(j)+" ");
        }
        System.out.println();
       }
    }
    
}
// ArrayList<Integer> list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainlist.add(list);
        //  ArrayList<Integer> list2=new ArrayList<>();
        //  list2.add(3);
        //  list2.add(4);
        //  mainlist.add(list2);
        //  for(int i=0 ; i<mainlist.size() ; i++){
        //     ArrayList<Integer> curlist=mainlist.get(i);     
        //     for(int j=0 ; j<curlist.size() ; j++){
        //         System.out.print(curlist.get(j)+" ");
        //     }
        //     System.out.println();
        //  }
        //  System.out.println(mainlist);
