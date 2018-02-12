import java.util.ArrayList;
/**
/**
*/
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[]args) {
		// TODO Auto-generated method stub
	ArrayList al = new ArrayList(10);
	
	for (String str:args) {
		al.add(str);
		
	}
		System.out.println("Array list is empty:" + al.isEmpty());
		System.out.println("Array list is Size:" + al.size());
		
		//al.add (new integer) 
		//al.add (Boolean.)
		
		System.out.println("Original :" + al);
		al.remove("two");
		System.out.println("Now :" + al);
		al.set(1,"new");
		System.out.println("Now:" + al);
		
		System.out.println("Contains four:" + al.contains ("four"));
		al.clear();
		System.out.println();
		
	}

}
