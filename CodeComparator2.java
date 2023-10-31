package prob1;

import java.util.Comparator;

public class CodeComparator2 implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// Separate the initial 2 letters from the following numbers & store each in variable
		String code1 = p1.getCode();
		String code2 = p2.getCode();
		String prefix1 = code1.substring(0,2);
		String prefix2 = code2.substring(0,2);
		int nums1 = 0;
		int nums2 = 0;
		
		// Checking for 't' in code before extracting number
		if(code1.contains("t")) {
			nums1 = Integer.parseInt(code1.substring(3, code1.length()-1));
		}
		else {
			nums1 = Integer.parseInt(code1.substring(3));
		}
		if(code2.contains("t")) {
			nums2 = Integer.parseInt(code2.substring(3, code2.length()-1));
		}
		else {
			nums2 = Integer.parseInt(code2.substring(3));
		}
		
		int val = 0;
		
		// If alphabetically greater, assign val with 1. Else, assign val with -1.
		// Checks all possible cases, which are:
		// QZ > DC, QZ > ML, DC > ML
		val = (prefix2.equals("QZ") && prefix1.equals("DC")) ? 1 : -1;
		if(val==1) { return val; }
		val = (prefix2.equals("QZ") && prefix1.equals("ML")) ? 1 : -1;
		if(val==1) { return val; }
		val = (prefix2.equals("DC") && prefix1.equals("ML")) ? 1 : -1;
		if(val==1) { return val; }
		
		// Compare number values within product code if the prefixes are equal.
		if(prefix1.equals(prefix2)) {
			// Check if codes contain a "t".
			// If they do, codes with "t" are greater than other codes with the same prefix.
			val = (code2.contains("t") && !code1.contains("t")) ? 1 : -1;
			if(val==1) { return val; }
			val = (!code2.contains("t") && code1.contains("t")) ? -1 : 1;
			if(val==-1) { return val; }
			val = (!code1.contains("t") && !code2.contains("t")) ? (nums1 - nums2) : -1;
		}
		
		return val;
	}

}
