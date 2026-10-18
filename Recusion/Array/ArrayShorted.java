package Recusion.Array;

// chech array is shorted or not
public class ArrayShorted {
    static void main(String[] args) {
        int[] arr = {1,2,3,5,8,5};
        if(arr[0]>arr[1]){
            System.out.println(desc(arr,0));
        }else{
            System.out.println(assc(arr,0));
        }




    }
     private static boolean desc(int[] arr,int i){
         if(i== arr.length-1){
             return true;
         }
         return arr[i]>arr[i+1] && desc(arr,i+1);
     }
    private static boolean assc(int[] arr,int i){
        if(i== arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && assc(arr,i+1);
    }




}
