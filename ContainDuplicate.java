package leetcode;

import java.util.Arrays;

public class ContainDuplicate {
	
    public static boolean containsDuplicate(int[] nums) {
        
       Arrays.sort(nums);
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
           
        }
         return false;
    }
    /*
     * HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
       return false; 
    }
     */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		boolean containsDuplicate = containsDuplicate(nums);
		System.out.println(containsDuplicate);
		
	}

}
