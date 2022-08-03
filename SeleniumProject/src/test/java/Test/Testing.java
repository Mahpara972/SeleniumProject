package Test;

import java.util.*;

public class Testing {
	public static void main(String[] args) {
		String str = "java program is java program"; 
		String[] data = str.split(" ");
		Map<String ,Integer> m = new HashMap<String, Integer>();
		
		for(String s:data) {
			if(m.containsKey(s)) {
				int count = m.get(s);
				m.put(s,count+ 1);
			}else {
				m.put(s, 1);
			}
			
		}
		
		System.out.println(m);
		String output = "";
		for(String s : m.keySet()) {
			output = output +" " +s;
		}
		System.out.println(output);
	}
}
