import java.util.*;
public class Main {
    public static void twoSum(long[] arr, int n, HashMap<Long, Integer> mp, long target) {
        int left = 0, right = n - 1;
        Arrays.sort(arr);
        while (left < right) {
            long sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.print((mp.get(arr[left]) + 1) + " " + (mp.get(arr[right]) + 1));
                return;
            }
            else if (sum < target)  left++;
            else  right--;
        }
        System.out.println("IMPOSSIBLE");
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int target = ss.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = ss.nextLong();
        HashMap<Long, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
            mp.put(arr[i], i);
        twoSum(arr, n, mp, target);
    }
}
