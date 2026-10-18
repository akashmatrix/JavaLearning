package Recusion.Array;

import java.util.ArrayList;

public class LinearSearch {
    static void main(String[] args) {
            int[] arr = {1,2,3,5,8,5};
            int target=5;
        System.out.println(search(arr,target,0));
        System.out.println(searchIndex(arr,target,0));
        System.out.println(findAllIndex(arr,target,0, new ArrayList<>()));

    }
    
//  This i code
  static int search(int[] arr,int target,int i){
       if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }else {
            return search(arr,target,i+1);
        }


   }

static boolean searchIndex(int[] arr,int target,int index){
    if(index==arr.length){
        return false;
    }
    return arr[index]==target || searchIndex(arr, target, index+1) ;
}
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list ){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
