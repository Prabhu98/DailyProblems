package leetcode;

public class ReverseInteger {
	
	/**
	 
	 Intialize sum =0
	 Iterate while loop check condition x!=0
	 Add sum = sum*10 + last_digit
	 x = x/10;
	 return sum
	 
	
	
	**/
	
	   public static int reverse(int x) {
	        
	        long sum = 0;
	        
	        while(x != 0){
	            int last_digit = x%10; 
	            sum = sum*10 + last_digit;
	            x = x/10;
	        }
	        
	        if(sum >= Integer.MAX_VALUE || sum <= Integer.MIN_VALUE){
	            return 0;
	        }
	        
	        return (int)sum;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 123;
		int reverse = reverse(x);
		System.out.println(reverse);
	}

}
