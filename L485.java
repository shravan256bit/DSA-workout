public class L485{
    public static void main (String[] a){
        int[] arra = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arra));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int num  : nums){
            if(num == 1){
                count++;
            }else{
                if(count>max){
                    max = count;
                }
                count = 0;
            }
        }
        return max;
        
    }
}