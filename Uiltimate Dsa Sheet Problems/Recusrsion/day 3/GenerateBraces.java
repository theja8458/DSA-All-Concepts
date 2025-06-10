import java.util.*;
class GenerateBraces {
    static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }

    static void generate(int n,int open,int close,String str,List<String> ans){
        if(str.length() == n*2){
            ans.add(str);
            return;
        }

        if(open < n){
            generate(n,open+1,close,str+"(",ans);
        }
        if(close < open){
            generate(n,open,close+1,str+")",ans);
        }
    }
   
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}