import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {24,57,2,7,3,75};

        int start = 0;
        int end = arr.length - 1;

        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reverse Array :" + Arrays.toString(arr));
    }
}
mM
