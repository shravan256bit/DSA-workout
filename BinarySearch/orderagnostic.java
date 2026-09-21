package BinarySearch;

public class orderagnostic {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,14,20,36,48};
        System.out.println(orderAgnostic(arr, 20));
        }  
    static int orderAgnostic(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isAsc){
                if(target > arr[mid]){
                start = mid+1;
                }
                else if(target <arr[mid]){
                    end = mid-1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(target > arr[mid]){
                end = mid-1;
                }
                else if(target <arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            
            }
        }
    return -1;
    }
}

