public class Keypad2 {
    public static void str_keypad(String str[],String S1){
        String nstr="";
        for(int i=0;i<S1.length();i++){
            if(S1.charAt(i)==' '){
                nstr+="0";
            }
            else{
                int index=Character.toUpperCase(S1.charAt(i))-'A';
                nstr+=str[index];
            }
        }
        System.out.println(nstr);
    }
    public static void main(String[] args) {
        String str[]={"2","22","222","3","33","333","4","44","444","5","55","555","6",
         "66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
         String S1="Geeks";
         str_keypad(str, S1);
    }
}
