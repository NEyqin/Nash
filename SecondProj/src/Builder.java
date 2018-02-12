/**
	 * 
	 */

public class Builder {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			//Initializing the StringBuilder class with
			
			StringBuilder sb= new StringBuilder(args[0]) ;
			String sub = sb.substring(sb.indexOf("I am Studying Java"));
					
			
			System.out.println("Given String:" + sb + " with length :" + sb.length());
			System.out.println("Firts three: " + sb.substring(0,3)) ;
			System.out.println("Given String:" + sb.substring(sb.length()-3));
			int startOfConstant = (sb.indexOf("I am Studying Java"));
			int endOfConstant = startOfConstant + constant.length();
			System.out.println("Print Studying: " + sb.substring(startOfConstant + endOfConstant)) ;
		
			//insert <_space your name> after "am"
			sb.insert ((sb.indexOf("am")+2)," Nurul");
			System.out.println("After Insert:" +sb);
			sb.delete(sb.indexOf("am"),sb.indexOf("am")+2);
			
	
		}
	}
