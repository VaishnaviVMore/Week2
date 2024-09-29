public class Duplicateconsecutive {
    public static void dup(String str){
        //StringBuilder Sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            // for(int j=i;j<str.length();j++){
            int count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            //Sb.append(str.charAt(i));
            // int a=str.charAt(i);
            System.out.println("Character "+str.charAt(i)+":"+count);
        }
    // }
    }
    public static void main(String[] args) {
        String str="aaabbcccd";
        dup(str);
    }
}
