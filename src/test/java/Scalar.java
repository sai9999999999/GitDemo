import java.util.ArrayList;
import java.util.Iterator;



	public class Scalar {
	    
	    
	    public static void main (String[] args) {
	        
	        
	        ArrayList<Integer> arr = new ArrayList<>();
	        arr.add(1);
	        arr.add(2);
	        arr.add(3);
	        arr.add(2);
	    arr.add(1);
	    
	    
	   System.out.println( solve(arr,5));
	    
	    }
	    public static int solve(ArrayList<Integer> A, int B) {
	        
	        int count =0;
	        
	        for(int i=0;i<A.size();i++){
	            
	               for(int j=i;j<A.size();j++){
	                   
	                   
	                   if((A.get(i)+A.get(j))==B){
	                       
	                       count++;
	                       System.out.println(A.get(i)+" "+A.get(j));
	                       System.out.println(count);
	                       
	                       
	                       
	                   }
	                   
	                   
	                   
	               }
	            
	            
	            
	            
	        }
	        
	        return count;
	        
	    }
	}
	    
	
