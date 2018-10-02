package plugins.executors;

/**
 * The Class WorkerThread.
 * 
 * @author Eedanna
 */
public class WorkerThread implements Runnable {

	/** The command. */
	private String command;

	/**
	 * Instantiates a new worker thread.
	 *
	 * @param s the s
	 */
	public WorkerThread(final String s) {
		this.command = s;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	/**
	 * Process command.
	 */
	private void processCommand() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.command;
	}

}
