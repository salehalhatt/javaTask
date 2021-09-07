package tasksa;


	public class throw_ {
		 
	    public static void main(String[] args) {
	        checkAge(70);
	    }
	 
	 
	    public static void checkAge (int age) {
	        try {
	            if(age > 63) {
	                throw new Exception("you are too old!");
	            }
	        }
	        catch( Exception e ) {
	            System.out.println( e.getMessage() );
	        }
	    }
	 
	}