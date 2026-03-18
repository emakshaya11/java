package DSA;

public class largestandsmallest {
	public static void main(String[] args) {
	int[] arr= {5,68,7,2,9,101};
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<max) {
			max=arr[i];
		}
	}
		System.out.println(max);
		
		
	 
	
	}
}
