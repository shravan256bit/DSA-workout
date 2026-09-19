import java.util.ArrayList;
import java.util.Scanner;

public class palbtw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int low = in.nextInt();
        System.out.println("Enter the upper limit");
        int up = in.nextInt();
        System.out.println(checkpal(low, up)); 
        in.close();
    }
    public static ArrayList<Integer> checkpal(int low,int up){
        ArrayList<Integer> palist = new ArrayList<>();
        for(int j = low;j<up;j++){
            String str = String.valueOf(j);
            int len = str.length();
            boolean isPal = true;
        
            for(int i=0;i<=len/2;i++){
                if(!(str.charAt(i) == str.charAt(len-1-i))){
                    isPal = false;
                }
            }
            if(isPal){
                palist.add(j);
            }
        }
        return palist;
        


    }
}
