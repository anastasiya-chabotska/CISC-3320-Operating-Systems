import java.util.HashMap;


public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//should print 1 if successful	
	System.out.println("Allocate Map (1 if success, -1 unsuccess): "+PidManager.allocateMap());
	
	//should print pid number from 300 to 5000
	System.out.println("Allocate Pid (pid number if success, -1 if unsuccess): "+PidManager.allocatePid());
	System.out.println("Allocate Pid (pid number if success, -1 if unsuccess): "+PidManager.allocatePid());
	
	//check if the first two pids are assigned values of 1
	System.out.println("A map of pids after allocating two pids: "+PidManager.pids);
	
	//release pid 300
			PidManager.releasePid(300);
			System.out.println("Release pid 300");
	
	//pid 300 should now have value 0
	System.out.println("A map of pids after releasing pid 300: "+PidManager.pids);
	
		

	}

}
