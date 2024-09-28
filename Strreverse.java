public class Strreverse {
    public static void main(String[] args) {
        String str="cat";
        StringBuilder reversestr=new StringBuilder();
        //char ch;
        for(int i=str.length()-1;i>=0;i--){
            reversestr.append(str.charAt(i));
            // ch=str.charAt(i);
            // str.charAt(i)=str.charAt(n-1-i);
            // str.charAt(n-1-i)=ch;
        }
        System.out.println(reversestr);
    }
}
