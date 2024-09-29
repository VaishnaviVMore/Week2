public class Compress {
    public static void com(String str){
        StringBuilder Sb= new StringBuilder(" ");
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            Sb.append(str.charAt(i));
            if(count>1){
                Sb.append(count);
            }
        }
        System.out.println(Sb);
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        com(str);
    }
}
