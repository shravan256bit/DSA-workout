public class linaersearch {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        System.out.println(lsearch(arr, 88));
        
    }
    static int lsearch(int arr[],int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i= 0;i<arr.length;i++){
            int elemnt  = arr[i];
            if(elemnt == target)
                return i;
        }
        return -1;
    }
}
