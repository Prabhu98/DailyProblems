package leetcode;

public class ReverseString {
	
	public static void reverseString(char[] s) {
	       int a = 0;
	       int b = s.length-1;
	        
	       while(a<=b){
	           char temp = s[a];
	           s[a]=s[b];
	           s[b]=temp;
	           
	        a += 1;
	        b -= 1;
	       }
	       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

	

}
