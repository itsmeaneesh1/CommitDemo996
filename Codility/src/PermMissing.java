import java.util.*;
public class PermMissing {

	public int solution(int[] A) {
		int i=0;
		Set<Integer> o=new HashSet<Integer>();
		for(i=0;i<A.length;i++) {
		o.add(A[i]);
		}
		for(i=1;i<=A.length+1;i++) {
		if(!o.contains(i)) {
		return i;
		}
		}
		return 0;
		}
	
}
