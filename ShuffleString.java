package leetcode;

public class ShuffleString {
	
	 public static String restoreString(String s, int[] indices) {
	        char[] shuffled = new char[s.length()]; // char array for shuffled word
	        char[] sArray = s.toCharArray();        // convert string to char array
	    
	       for (int i = 0; i < s.length(); i++) {  
	        shuffled[indices[i]] = sArray[i];   // indices[i] = new index -- sArray[i] = letter at current index
	    }
	    
	    return s = String.valueOf(shuffled);
	    }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "codeleet";
      int[] indices = {4,5,6,7,0,2,1,3};
      String restoreString = restoreString(s,indices);
      System.out.println(restoreString);
	}

}
