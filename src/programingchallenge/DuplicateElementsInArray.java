package programingchallenge;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {
	   public static void main(String[] args) {   
		   //First Method----------------------------------------------------------------------------
		   String duplicates[]= new String[] {"Java","Hibernate","Java","Spring"};
		   Set nonDuplicatesSet= new HashSet();
		   Set duplicatesSet=new HashSet<>();
		   for (String string : duplicates) {
			   if(!nonDuplicatesSet.contains(string))
			   {
				   nonDuplicatesSet.add(string);
			   }else {
				duplicatesSet.add(string);
			}
			
		}
		   System.out.print("Duplicate Element In Array is : " + duplicatesSet);
		   
		   
		   
		   //Second MEthod________________________________________________________________________________________________________________
	       /* String[] names = new String[] { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

		   
		   System.out.println("Duplicate elements from array using HashSet data structure");
	        Set<String> store = new HashSet<>();

	        for (String name : names) {
	            if (store.add(name) == false) {
	                System.out.println("found a duplicate element in array : "
	                        + name);
	            }
	        }
	          */
		   //Third Method-----------------------------------------------------------------------------------------------------------------
	        //Initialize array   
	       /* String [] arr = new String [] {"Java","Spring","Hibernat","Java"};   
	          
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  */
	    }  

}
