package tasksa;

	import java.util.ArrayList;        


public class array {

   public static void main(String[] args) {

       ArrayList arr1 = new ArrayList();

       ArrayList<String> arr2 = new ArrayList<>();

       ArrayList<Integer> arr3 = new ArrayList<>();


       arr1.add(null);
       arr1.add(true);
       arr1.add(1234);
       arr1.add("java");
       arr1.add('A');

       arr2.add("A");
       arr2.add("B");
       arr2.add("C");

       arr3.add(1);
       arr3.add(2);
       arr3.add(3);


       System.out.println("arr1: " +arr1);

       System.out.println("arr2: " +arr2);

       System.out.println("arr3: " +arr3);

   }

}

