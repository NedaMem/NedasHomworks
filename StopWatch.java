package sixmars;

public class StopWatch {
	private long startTime;
	private long endTime;
	private long startSeconds;
	private long stopSeconds;

	public StopWatch() {

		startTime = System.currentTimeMillis();

	}

	// Start method to set time to current start time in milliseconds
	public void start() {

		startTime = System.currentTimeMillis();
		startSeconds = startTime / 1000;

	}

	// method to set time to stop
	public void stop() {
		endTime = System.currentTimeMillis();
		stopSeconds = endTime / 1000;
	}

	// returns the difference of the start time and end time
	public long getElapsedTime() {
		return stopSeconds - startSeconds;
	}

	public static void main(String[] args) {

		StopWatch stopWatch = new StopWatch();

		int size = 100000;

		double[] ls = new double[size];

		for (int i = 0; i < ls.length; i++) {

			ls[i] = Math.random() * ls.length;
		}

		stopWatch.start();

		selectionSort(ls);

		stopWatch.stop();

		// call elapsed time
		System.out.println("The sort time for this numbers is: "
				+ stopWatch.getElapsedTime() + " seconds.");
	}

	public static void selectionSort(double[] lst) {

		for (int i = 0; i < lst.length - 1; i++) {

			// find the minimum in the lst
			double currentMin = lst[i];

			int currentMinIndex = i;

			for (int j = i + 1; j < lst.length; j++) {
				if (currentMin > lst[j]) {
					currentMin = lst[j];
					currentMinIndex = j;
				}
			}

			// swap
			if (currentMinIndex != i) {
				lst[currentMinIndex] = lst[i];
				lst[i] = currentMin;
			}
		}
	}
}
