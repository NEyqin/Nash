/**
 * 
 */

/**
 * @TestString2
 *
 */
public class TestString2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String first = "1";
		int second = 2 ;
		int third = 3 ;
		String fourth = "c";
		String fifth = "c";
		String sixth = new String ("c"); // memory references. new object all together and sign the value. 
		
		if(fourth == fifth)
			System.out.println("fourth and fifth is same : " + fourth) ; // index
		else
			System.out.println("fourth and fifth are not the same : ") ;
		
		if (fourth == sixth)
		System.out.println("Now fourth is: " + fourth) ;
		
		else 
			System.out.println("fourth and fifth is are not the same : ") ;
*/
		
		String sms="Selamat Datang ke Malaysia!!";
		System.out.println("SMS Size is :" + sms.length());
		System.out.println("Text at 10th position / 9th index : " + sms.charAt(9)) ;
		System.out.println("Index of the best ! : " + sms.indexOf("!"));
		System.out.println("Substring of 0 - 10 : " + sms.substring(0,10)) ;
		System.out.println("lower : " + sms.toLowerCase()) ;
		System.out.println("UPPER : " + sms.toUpperCase()) ;
		
		String country = "Malaysia";
		
		if(country.equals((args)[0]));
		System.out.println("Country is Malaysia ") ;
		
		
			System.out.println("Country is Not Malaysia but: ");
		
		
		
}
}
	