package Team17;

class NegativeToZero {
    int [] negativetozero(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 0 ? 0 : arr[i];
        }
        return arr;
    }
}
