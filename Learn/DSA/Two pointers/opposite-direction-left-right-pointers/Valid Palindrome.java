import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.next();
		int left = 0, right = str.length()-1;
		while(left < right) {
		    if(str.charAt(left) == str.charAt(right)){
		        left++;
		        right--;
		    }
		    else{
		        System.out.println("Given String is Not a Palindrome");
		        return;
		    }
		}
		System.out.println("Given String is Palindrome");
	}
}