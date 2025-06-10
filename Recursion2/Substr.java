public class Substr {
  public static int countsubstr(String str,int si,int ei){
    if(si > ei){
        return 0;
    }
    int firstCharRem=countsubstr(str, si+1, ei);
    int lastCharRem=countsubstr(str, si, ei-1);
    int firstlastCharRem=countsubstr(str, si+1, ei-1);

    int ans=firstCharRem + lastCharRem -firstlastCharRem;
    if(str.charAt(si) == str.charAt(ei)){
        ans++;
    }
    return ans;
  }


    public static void main(String args[]){
    String str="aba";
    int n=str.length()-1;
    int ans=countsubstr(str, 0, n);
    System.out.println(ans);
    }
    
}
