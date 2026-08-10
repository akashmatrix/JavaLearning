package LinearSearch;

import java.sql.SQLOutput;

public class FindMin {
    public static void main(String[] args){
        int[] arr={54,-8,5,2,-19,54};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
       int ans= arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]<ans){
               ans=arr[i];
           }
       }
       return ans;
    }
}
