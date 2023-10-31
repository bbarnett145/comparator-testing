package prob1;

import java.util.Comparator;

public class CodeComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// Separate the initial 2 letters from the following numbers & store each in variable
		String prefix1 = p1.getCode().substring(0,2);
		String prefix2 = p2.getCode().substring(0,2);
		int nums1 = Integer.parseInt(p1.getCode().substring(3));
		int nums2 = Integer.parseInt(p2.getCode().substring(3));
		int val = 1;
		
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
			return nums1 - nums2;
		}
		
		return val;
	}

}
