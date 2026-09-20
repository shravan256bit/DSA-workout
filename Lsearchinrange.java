public class Lsearchinrange {
    public static void main(String[] args) {
        int[] arr = {11,22,33,4,55,33,56,7,8654};
        int foundp = search(arr, 4,2 , 5);
        System.out.printf("it was found at %d",foundp);

    }
    static int search(int[] arr,int target,int start,int end){
        for(int i = start;i<=end;i++){
            int elemt = arr[i];
            if(elemt == target){
                return i;

            }
        }
        return -1;
    }
}
