package Team17;

import static java.util.Arrays.sort;

public class getMedian {
    public void getMedian(int []arr){
        sort(arr);
        double median=0.0;
        int index=0;
        if (arr.length %2 != 0){
            index=(arr.length/2);
            median=(arr[index-1]+arr[index])/2;
        }
        else{
            index=(arr.length/2)+1;
            median= arr[index-1];
        }
        System.out.println("Median is : "+median);
    }
}
