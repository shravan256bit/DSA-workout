public class mva {
    public static void main(String[] args) {
        int arr[] = {23,12,4,5,6776,865,23,22,9,6};
        System.out.println(max(arr)); 
    }
    public static int max(int[] arr){
        int max1 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1 = arr[i];
            }
        }
        return max1;
    }
}
