import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the array : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements in the array : ");
		for(int i = 0; i < n ; i++)
			arr[i] = s.nextInt();
		System.out.println("Enter the Target : ");
		int target = s.nextInt();
		int left = 0, right = n-1;
		while(left < right) {
			int sum = arr[left]+arr[right];
			if(sum == target) {
				System.out.println(left +" "+right);
				break;
			}
			else if(sum < target)
			    left++;
			else    
			    right--;
		}
	}
}