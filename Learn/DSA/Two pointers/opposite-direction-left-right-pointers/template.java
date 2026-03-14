public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (SomeCondition) {
                // process
                left++;
                right--;
            } 
            else if (SomeCondition) {
                // process
                left++;
            } 
            else {
                right--;
            }
        }
    }
}

// When to use it
// Sorted arrays
// Pair sum problems
// Palindrome checking
// Container problems