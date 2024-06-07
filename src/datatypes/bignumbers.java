package datatypes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bignumbers {
	/*
	 * a> BigInteger
	 * b> BigDecimal
	 * kehi kura double qotation ma thapnu lai concatination vaninxa 
	 */

	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
		
		BigInteger c = a.add(b);
		
		// Long d = c.longValue();
		
		System.out.println("Total = "+c);
		//System.out.println("Total = "+d);
		
		
		BigDecimal d = BigDecimal.valueOf(Double.MAX_VALUE);
		BigDecimal e = BigDecimal.valueOf(Double.MAX_VALUE);
		
		BigDecimal f = d.add(e);
		System.out.println("Total = "+f); 
		
		
		
		
		
		
		
 	}
}
