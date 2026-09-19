
import java.util.Arrays;

class reverse{
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static int[] swap(int[] arr,int v1,int v2){
        int temp = arr[v1];
        arr[v1] = arr[v2];
        arr[v2] = temp;
        return arr;
    }
}