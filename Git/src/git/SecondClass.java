package git;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SecondClass {

	public static void main(String[] args) {
		Map<String, String> lead = new TreeMap<String, String>();
		lead.put("M1064010", "Ravinder Kumar");
		lead.put("M10640002", "Ravinder Kumar");
		lead.put("M10640003", "Ravinder Kumar");
		lead.put("M10640001", "Ravinder Kumar");
		
		
		lead.put("M1064005","Ravinder Kumar");
		
		

		for (Entry<String, String> e : lead.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		
		lead.put("M1064005","Ravinder Kumar");
		
	}
}
