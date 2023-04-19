package array;
import java.util.Arrays;

public class EvenOdd2 {
	
		   public static void main(String[] args) {
			   
		      int[] no = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; //declaration and initialization
		      
		      System.out.println("The actual array is:"+Arrays.toString(no)); //actual array printing
		      
		      /*
		        //System.out.println("The actual array is:"); //array printing 
		    	//for(int i:no)//for each loop for print 
		    	//System.out.println(i); //print
				*/
		      
		      System.out.println("The Even numbers:");
		      for(int i = 0; i < no.length; i++) {
		         if(no[i] % 2 == 0) {
		            System.out.println(no[i]);
		         }
		      }

		      System.out.println("The Odd numbers:");
		      for(int i = 0; i < no.length; i++) {
		         if(no[i] % 2 != 0) {
		            System.out.println(no[i]);
		         }
		         
		      }
		   }
		}


