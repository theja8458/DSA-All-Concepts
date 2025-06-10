import java.util.*;
class LetterCombiOfPhNo {
     static void rec(int i,String digits,String mp[],String res,List<String> ans) {
        if(i == digits.length()){
            ans.add(res);
            return;
        }
        char ch=digits.charAt(i);
         int num=ch-'0';
         String str=mp[num];
         for(int j=0 ; j<str.length() ; j++){
            rec(i+1,digits,mp,res+str.charAt(j) , ans);
         }
    }
    static List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        String mp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        rec(0,digits,mp,"",ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}