package leetcode;

public class MissingNumber {
	
	 public static int missingNumber(int[] nums) {
	        
	        int sum = 0;
	        for (int i : nums) {
				sum += i;
			}
	        int n = nums.length;
	        int sumall = n*(n+1)/2;
	        
			return sumall-sum;
	    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] n = new int[] {3,0,2};
        int missingNumber = missingNumber(n);
        System.out.println(missingNumber);
	}

}
