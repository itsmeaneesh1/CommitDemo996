import java.util.*;

public class OddOccurence {

	public int solution(int[] A) {
		int output=0;
	    HashMap <Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();
	      
	    for(int i=0; i<A.length; i++) {
	      if(occurrencesMap.containsKey(A[i])) {
	        occurrencesMap.put(A[i], occurrencesMap.get(A[i])+1); //increment occurrence counter and store it
	      }
	      else {
	        occurrencesMap.put(A[i], 1); //1st occurrences of this value
	      }
	    }
	    Set<Integer> keySet = occurrencesMap.keySet();
	   
	    for(int currentKey : keySet) {
	      int occurrences = occurrencesMap.get(currentKey);	     
	      //if occurs odd number of times, we found the unpaired value - no need to continue checking
	      if(occurrences % 2 != 0) 
	      {
	    	  output=currentKey;
	    	  break;
	      }
	    	  
	    }
		return output;
	 }
}
