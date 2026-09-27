package BinarySearch;
public class CelingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.print(celing(arr, 4));
    }
    static int celing(int[] arr,int target){
        boolean isAsc = arr[0]<arr[arr.length-1];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else if((target>arr[mid])){
                    start = mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }else if(target>arr[mid]){
                    end = mid-1;
                }
            }
        }
        
    return start;
    }

}
