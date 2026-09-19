import java.util.*;
public class swap {
    public static void main(String[] args) {
        int[] arr = {11,55,66,77,88,99,22};
        System.out.println(Arrays.toString(sap(arr,1,5)));
    }
    public static int[] sap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        return arr;
    }
}
