package leetcode;

public class ReverseWordInString {
	
	
	
	 public static String reverseOnlyLetters(String s) {
	        
	        int i = 0;
	        int j = s.length()-1;
	        char[] arr  = s.toCharArray();
	        
	        while(i<j){
	            if(isLetter(arr[i])&& isLetter(arr[j])){
	                
	                char ch = arr[i];
	                arr[i] = arr[j];
	                arr[j] = ch;
	                i++;
	                j--;
	                
	            }
	            else if(!isLetter(arr[i]))
	                    i++;
	             else 
	                    j--;
	                        
	    }
	        return String.valueOf(arr);
	        //return System.out.println(String.valueOf(arr));
			}
			 public static boolean isLetter(char ch){
	            boolean flag= false;
	                if(( ch>='a' && ch<='z') ||  (ch>='A'&&ch<='Z'))
	                flag = true;
	            return flag;
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "ab-cd-e1";
       System.out.println(reverseOnlyLetters(s));
	}

}
