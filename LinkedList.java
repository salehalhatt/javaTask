package tasksa;


	import java.util.*;       
	 
	public class LinkedList {
	 
	    public static void main(String[] args) {
	 
	        LinkedList arr = new LinkedList();
	 
	        System.out.println("All elements:       " + arr);
	        System.out.println("Number of elements: " + arr.size() + "\n");
	 
	        arr.add("B");        
	        arr.add("C");        
	        arr.add("E");         
	        arr.add(2, "D");     
	        arr.addFirst("A");    
	        arr.addLast("F");  
	 
	        System.out.println("All elements:       " + arr);
	        System.out.println("Number of elements: " + arr.size() + "\n");
	 
	        arr.remove();       
	        arr.remove(2);       
	        arr.remove("B");     
	 
	        System.out.println("All elements:       " + arr);
	        System.out.println("Number of elements: " + arr.size() + "\n");
	 
	    }
	 
	}
