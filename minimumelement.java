public class minimumelement {
    public static void main(String[] args) {
        int[] arr = {11,22,33,4,55,33,56,7,8654};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int mini= arr[0];
        for(int m : arr){
            if(m < mini){
                mini = m;
            }
        }
        return mini;
    }
}
