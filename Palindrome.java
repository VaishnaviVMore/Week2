public class Palindrome {
    public static boolean pali(String str){
        int n=str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
        }
        }
        System.out.println("It is palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str="madam";
        pali(str);
    }
}
