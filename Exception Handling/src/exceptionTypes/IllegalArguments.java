package exceptionTypes;

public class IllegalArguments {
	
	 public static void print(int a)
	    {
	         if(a>=18){
	          System.out.println("Eligible for B-tech");
	          }
	          else{
	    
	          throw new IllegalArgumentException("Not Eligible for B-tech");
	                                    
	          }
	       
	    }
	    public static void main(String[] args) {
	    	IllegalArguments.print(21);         // value given 
	    }

}
