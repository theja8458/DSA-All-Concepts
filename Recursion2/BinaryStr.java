public class BinaryStr {

  public static void binarystr(int n,int lastplace,String str){
    if(n==0){
        System.out.println(str);
        return;
    }
    binarystr(n-1, 0, str+"0");
    if(lastplace == 0){
        binarystr(n-1, 1, str+"1");
    }
  }


    public static void main(String args[]){
  binarystr(3, 0, "");
    }
    
}
