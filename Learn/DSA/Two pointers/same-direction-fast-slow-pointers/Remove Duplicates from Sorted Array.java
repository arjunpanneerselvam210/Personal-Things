import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};
        int n = arr.length;
        int left = 0;
        for(int right = 1; right < n; right++){
            if(arr[left] != arr[right]){
                left++;
                arr[left] = arr[right];
            }
        }
        for(int i = 0; i <= left; i++){
            System.out.print(arr[i] + " ");
        }
    }
}