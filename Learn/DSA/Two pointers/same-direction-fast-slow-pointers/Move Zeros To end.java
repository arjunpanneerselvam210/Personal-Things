
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {0,1,0,2,0,3};
	    int n = arr.length;
	    int slow = 0;
	    for(int fast = 1 ; fast < n; fast++){
	        if(arr[fast] != 0){
	            int temp = arr[slow];
	            arr[slow] = arr[fast];
	            arr[fast] = temp;
	            slow++;
	        }
	    }
	    for(int i = 0;i < n; i++){
	        System.out.print(arr[i]+ " ");
	    }
	}
}
