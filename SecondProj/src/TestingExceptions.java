/**
 * @author User
 *
 */
public class TestingExceptions {

	/**
	 * @param <String>
	 * @param args
	 */
	public static <String> void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String name = args[0]; // y ni akan jump ke catch. 
			System.out.println("Your name is :" + args[0]);
			   System.out.println("welcome to vote");  
			
			
			System.out.println("Name printed ...");
		
		}catch (Exception ex) {
			System.out.println("Please provide your name as command line parameter." + " eg: java TestingExceptions <Your Name>");
		}
	}

}