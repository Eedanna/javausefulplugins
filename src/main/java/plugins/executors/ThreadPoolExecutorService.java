/**
 * 
 */
package plugins.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The Class ThreadPoolExecutorService.
 * 
 * @author EedannaK
 */
public class ThreadPoolExecutorService {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final ExecutorService executor = getExecutorService();

		for (int i = 0; i < 5; i++) {
			final Runnable worker = new WorkerThread(" " + i);
			executor.execute(worker);
		}

		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Completed all threads");
	}

	/**
	 * Gets the executor service.
	 *
	 * @return the executor service
	 */
	private static ExecutorService getExecutorService() {
		return Executors.newFixedThreadPool(5);
	}

}
