/**
 * 
 */

/**
 * @author This class test Java Arrays
 *
 */
public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // one value can be return
		// TODO Auto-generated method stub
		double salaries [] = {100,150,160,170,180};
		
		/*for (int i=0;i <=salaries.length; i++) {
			System.out.println("Salary of " + i + " is "+ salaries [i] );
		}
	*/
		int i=0;
		for (double sal:salaries) {
			System.out.println("Salary is "+i + " is " + sal);
			i++;
		}

}
}
