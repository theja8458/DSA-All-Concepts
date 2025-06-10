public class MaxScore {
    public static void main(String args[]){

        String str="00111";
        int OneCount=0;
        int ZeroCount=0;
        int max=0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == '1'){
                OneCount++;
            }
        }
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == '0'){
                ZeroCount++;
            }else{
                OneCount--;
            }
            max=Math.max(OneCount+ZeroCount, max);

        }
        System.out.println(max);
    }
}
