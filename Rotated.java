public class Rotated {
    public static boolean isStrrotated(String str,String str1){
        if(str.length()==str1.length()&&
        (str+str).indexOf(str1)!=-1){
            System.out.println(str+" is rotation of "+str1);
            return true;
        }
        else{
            System.out.println("not rotated");
            return false;
        }
    }
    public static void main(String[] args) {
        isStrrotated("abcd", "cdab");
    }
}
