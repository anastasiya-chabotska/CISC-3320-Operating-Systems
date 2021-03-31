import java.util.HashMap;
import java.util.Map;

public class PidManager {
	
	static final int MIN_PID=300;
	static final int MAX_PID=5000;
	
	static Map<Integer, Integer> pids = new HashMap<>();
	
	/*allocateMap
	 * - checks if the pids map is empty, and if yes, 
	 * fills it with keys(pids) from 500 to 3000
	 * with values 0, returns 1 
	 * - if the map is not empty, returns -1, meaning unsuccessful*/
	public static int allocateMap() {
		
		if (pids.isEmpty()) {
			for (int i=MIN_PID; i<=MAX_PID; i++) {
				pids.put(i, 0);	
			}
		
		return 1;
		}
		else return -1;
	}
	
	/*allocatePid
	 * - iterates over the map of pids to check for availability
	 * - if the value of a pid is 0, meaning it's available, 
	 * allocates the pid, and returns its id
	 * - otherwise, returns -1 (unsuccessful) */
	public static int allocatePid() {
		
		for (int i= MIN_PID; i<=MAX_PID; i++) {
			if (pids.get(i)==0) {
				pids.put(i, 1);
				return i;
			}
			
		}
		return -1;
	}
	
	/*releasePid
	 * - assigns value 0 to a given pid*/
	public static void releasePid(int pid) {
		pids.put(pid, 0);
	}


}
