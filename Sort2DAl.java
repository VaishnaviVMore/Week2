import java.util.*;
public class Sort2DAl {
    public static void dsort(int arr[][]){
        ArrayList <Integer>list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                    {12,36,57,65},
                    {27,47,68,78},
                    {34,59,79,80}};
        dsort(arr);
    }
}
