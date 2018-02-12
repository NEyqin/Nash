/**
 * 
 */

/**
 * @author User
 *
 */
public class TestMultiArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course_subjects [][] = new String  [2][2];
		course_subjects [0][0] = "CS-Maths" ;
		course_subjects [0][1] = "CS-Engslish" ;
		course_subjects [0][1] = "AC-Acccounting" ;
		course_subjects [0][1] = "CS-Bahasa Melayu" ;
		
		String course_subjects2 [][] = {{"CS-Maths","CS-Engslish", "AC-Acccounting"}, {"AC-Accounting", "AC-Bahasa Melayu"}};

		
		for (int i=0;i < course_subjects.length; i++) {
			for (int j = 0; j < course_subjects[i].length; j++) {
				System.out.println("Course of " + i + "Subject of " + j + " is " + course_subjects[i] [j]);
	}
	}
	}
}
		


		
