package Team17;
import java.util.Arrays;
public class get_the_max3num{
       public static void max_3_num(int arr[]) {
        int []temp_arr = new int [arr.length];
        System.arraycopy(arr, 0, temp_arr, 0, arr.length);
        Arrays.sort(temp_arr);
	System.out.println("the max 3 numbers : ");
        for (int i = arr.length - 1 ; i >= arr.length-3 ; i--){
            System.out.print(temp_arr[i]+" ");
        }
        System.out.println("");
        }
 }
