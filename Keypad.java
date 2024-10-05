import java.util.*;
public class Keypad {
    public static void str_keypad(String str[],String S1){
        StringBuilder Sb=new StringBuilder("");
        for(int i=0;i<S1.length();i++){
            if(S1.charAt(i)==' '){
                Sb.append("0");
            }
            else{
                int index=Character.toUpperCase(S1.charAt(i))-'A';
                Sb.append(str[index]);
            }
        }
        System.out.println(Sb);
    }
    public static void main(String[] args) {
        String str[]={"2","22","222","3","33","333","4","44","444","5","55","555","6",
         "66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
         String S1="Geeks";
         str_keypad(str, S1);
    }
}
