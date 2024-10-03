public class First_last{
    public static void Sorted_Occerance(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("First Occerance: "+i);
                break;
            }
        }
        for(int j=arr.length-1;j>0;j--){
            if(arr[j]==target){
                System.out.println("Last Occerance: "+j);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,5,5,5,8,9,10};
        Sorted_Occerance(arr, 5);
    }
    
}