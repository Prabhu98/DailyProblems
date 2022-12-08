package Day30Nov2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

public class AcIIValue {
	
	@Test
	public void td1() {
		      List<Character> ls = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','s','t','u','v'));
		      List<Character> l1 = largest4(ls);
		      System.out.println(l1);
	}
	
	
	
	public static List<Character> largest4(List<Character> a) {
        List<Character> lst = new ArrayList<Character>();
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        
        for(int i=0;i<a.size();i++){
            hmap.put(a.get(i), hmap.getOrDefault(a.get(i), 0) + i+1);
        }
        // a -97 ,b=98 ,c=99  ... v=
		for (Entry<Character, Integer> entry : hmap.entrySet()) {
			if(entry.getValue() >=9) {
		           Integer value = entry.getValue();
		           Arrays.sort(value);
		           lst.add(entry.getKey());
			}
			
		}
		return lst;
		
       
        
  }

}


