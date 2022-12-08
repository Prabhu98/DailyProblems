package leetcode;

public class VaildPalindrome {
	
	public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            
            if(i < j && Character.toLowerCase(s.charAt(i++))!= Character.toLowerCase(s.charAt(j--))){
                return false;
            }
        }
          return true;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
	    System.out.println(palindrome);
	}

}
