package leetcode;

import java.util.HashMap;

public class UniqueCharacter {
	
	public static int firstUniqChar(String s) {
        
	       HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
	       
	        for(int i=0; i < s.length();i++){
	            char currentchar = s.charAt(i);
	            
	            if(!hmap.containsKey(currentchar)){
	                hmap.put(currentchar,i);
	            } else {
	                hmap.put(currentchar,-1);
	            }
	        }
	        int min = Integer.MAX_VALUE;
	        for(char c : hmap.keySet()) {
	            if(hmap.get(c) > -1 && hmap.get(c) < min){
	                min = hmap.get(c);
	            }
	            
	        }
	        return min == Integer.MAX_VALUE ? -1 :min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstUnique = firstUniqChar("love");
		System.out.println(firstUnique);
	}

}
