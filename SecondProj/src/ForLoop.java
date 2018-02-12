// for Loop
// Program to print a sentence 10 times
// CMD javac -d . ForLoop.java
//		java ForLoop 

class ForLoop {
   public static void main(String[] args) { // args 
      //String myWar = "Nothing" ; // Nothing is immutable that cannot change 

      StringBuilder sb = new StringBuilder (10) ;
      sb.append("Nothing") ;
	  System.out.println("sb:" + sb);
	  
	   for (int i = 1; i <= 10; ++i) { //initialized (parameter )block // test expression (unity operator)/ increase tmbh 1. 
         System.out.println("My var at Line " + i + " with value : " + (myWar += "-" + i));
      }
   }
}