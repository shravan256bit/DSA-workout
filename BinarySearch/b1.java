package BinarySearch;

public class b1 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,14,20,36,48};
        System.out.println(binarysearch(arr, 9));
    }
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;


        while(start <=end){
            int mid = start + (end - start)/2;//if we use s+e/2 there is chsnce that s+e may exceeds interger limit in java
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
