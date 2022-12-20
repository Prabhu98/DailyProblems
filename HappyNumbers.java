package leetcode;

import java.util.HashSet;

public class HappyNumbers {
	
	public static boolean happyNumber(int n) {
		HashSet<Integer> hset = new HashSet<Integer>();
		while(n != 1) {
			int current = n;
			int sum = 0;
			while(current != 0) {
				sum = sum + (current % 10) * (current % 10);
				current = current / 10;
			}
			if(hset.contains(sum)) {
				return false;
			}
			
			hset.add(sum);
			n = sum;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean happyNumber = happyNumber(19);
		System.out.println(happyNumber);
	}

}
