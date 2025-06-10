public class RemDupliInStr {

 public static void remdupli(String str,int idx, StringBuilder newstr, boolean map[]){
    if(idx == str.length()){
        System.out.println(newstr);
        return;
    }

    char curChar=str.charAt(idx);
    if(map[curChar-'a'] == true){
        remdupli(str, idx+1, newstr, map);
    }else{
        map[curChar-'a'] = true;
        remdupli(str, idx+1, newstr.append(curChar), map);

    }

 }
    public static void main(String args[]){
        String str="appnnacollege";
        remdupli(str, 0, new StringBuilder(""), new boolean[26]);

    }
    
}
