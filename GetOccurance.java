/**
 * 
 */
package Day06Nov2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * @author prabhu A
 *
 */
public class GetOccurance {

	@Test
	public void td1() {
		String s = "aaabbaa";
		String occurance = getOccuranceIII(s);
		System.out.println(occurance);
	}

	/**
	 * initialize start =0 end =0,count=0 compare i and i+1
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 */

	public String getOccurance(String s) {

		StringBuilder sb = new StringBuilder();

		int start = 0, end = 0, count = 0;

		char[] ch = s.toCharArray();

		while (end < s.length()) {
			if (ch[start] == ch[end]) {
				count++;
				end++;

			} else if (ch[start] != ch[end]) {
				sb.append(count + "");
				sb.append(s.charAt(start));
				count = 0;
				start = end;
			}

		}
		sb.append(count + "");
		sb.append(s.charAt(start));
		return sb.toString();

	}

	public String getOccuranceII(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i)) {
				count++;
			} else if (s.charAt(i) != s.charAt(i + 1)) {
				sb.append(count + "");
				sb.append(s.charAt(i));
				count = 0;
			}
		}

		return sb.toString();

	}

	
	public String getOccuranceIII(String s) {
		StringBuilder sb = new StringBuilder();
		Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		int start =0 , end=0;
		while(end < s.length()) {
			if(s.charAt(end) == s.charAt(start)) {
			hmap.put(s.charAt(end), hmap.getOrDefault(s.charAt(end),0)+1);
			end++;
			}else if(s.charAt(end) !=s.charAt(start)) {
				for (Entry<Character, Integer> i1 : hmap.entrySet()) {
					sb.append(i1.getKey());
					sb.append(i1.getValue());			          
				} 
				hmap.clear();
				start=end;
			}
		}
		for (Entry<Character, Integer> i1 : hmap.entrySet()) {
			sb.append(i1.getKey());
			sb.append(i1.getValue());		          
		} 
		
		
		return sb.toString();
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

