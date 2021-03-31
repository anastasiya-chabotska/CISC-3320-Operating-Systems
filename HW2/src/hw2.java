import java.util.HashMap;



class MyThread extends Thread {
	
	@Override
	public void run() {
	
		//allocate the pid for a process
		int pid = PidManager.allocatePid();
		System.out.println("Allocated pid "+pid);
		
		//sleep for a random time between 0 to 9 seconds
		try {
			Thread.sleep(1000*(int)(Math.random()*10));	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//release the pid when process finished sleeping
		PidManager.releasePid(pid);
		System.out.println("Released pid "+pid);
		
		
	}
}

public class hw2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//allocate a map to store all available pids
		PidManager.allocateMap();
		
		//create an array to store threads
		MyThread threads [] = new MyThread[100];
		
		//fill the array with 100 threads
		for (int i=0; i<100; i++) {
			threads[i]=new MyThread();
		}
		
		//start all the threads
		for (int i=0; i<100; i++) {
			threads[i].start();
		}
		
	}

}
