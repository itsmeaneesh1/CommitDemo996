import java.util.*;

public class BinaryGap
{
	public int solution(int N)
	{
		System.out.println("New LINE"); 
		 String binaryString = Integer.toBinaryString(N);
		   System.out.println(binaryString);
		    int longestBinaryGap = 0;
		    List<Integer> onesList = new ArrayList<Integer>();		   
		    for(int i=0; i<binaryString.length(); i++) 
		    {
		      if(binaryString.charAt(i) == '0') 
		    	  		continue;
		       onesList.add(i);
		    }
		    System.out.println(onesList);
		    
		    for(int i=0; i<onesList.size() - 1; i++) 
		    {
		      int indicesDiff = onesList.get(i+1) - onesList.get(i) - 1;	     
		      longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
		    }
		    return longestBinaryGap;
		
	}
	
		public static void main(String[] args) 
		{
			System.out.println(new BinaryGap().solution(33));
		}
}
