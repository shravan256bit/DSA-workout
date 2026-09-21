import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {11,22,33,44},
            {21,32,43,54},
            {65,43,21,56,32}
        };
        int [] ans = search(arr,32 );
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};//making a new array and returning
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         if(arr[row][col] > max){
        //             max = arr[row][col];
        //         }
        //     }
        // }
        for(int[] rowe : arr){
            for(int cole : rowe){
                if(cole > max){
                    max = cole;
                }
            }
        }
        return max;
    }
}
