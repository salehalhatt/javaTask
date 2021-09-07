package tasksa;


	import java.util.Vector;                                       
	 
	public class vector {
	 
	    public static void main(String[] args) {
	 
	        Vector v = new Vector();                                
	 
	        System.out.println("capacity = " + v.capacity());        
	        System.out.println("size     = " + v.size() + "\n"); 
	        
	        v.add("A");                                              
	        v.add("B");
	        v.add("C");
	        v.add("D");
	        v.add("E");
	        v.add("F");
	        v.add("G");
	        v.add("H");
	        v.add("I");
	        v.add("J");
	        v.add("K");
	 
	        System.out.println("capacity = " + v.capacity());       
	        System.out.println("size     = " + v.size() + "\n");  
	 
	        v.trimToSize();                                     
	 
	        System.out.println("capacity = " + v.capacity());        
	        System.out.println("size     = " + v.size());
	 
	    }
	 
	}


