package Day30Nov2022;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SimplemaxDiff {
	
	
	@Test
	public void td1() {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(7);
		ls.add(1);
		ls.add(2);
		ls.add(5);
		int simpleMaxDiff = isSimpleMaxDiff(ls);  
		System.out.println(simpleMaxDiff);
	  
	}
	
	public static int isSimpleMaxDiff(List<Integer> pq) {
		
		int min = pq.get(0);
		
		int neg =-1;
		
		for(int i=1;i<pq.size();i++) {
			
			if(pq.get(i) > min) {
				neg = Math.max(pq.get(i)-min, neg);
			}
			 min = Math.min(min, pq.get(i));
		}
		
		
		return neg;
		
		
	}
	
	 
	}
		
		
		


