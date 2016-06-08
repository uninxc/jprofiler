package com.github.uninxc.profiler.utils;

public class Stopwatch {

	private long elapsed;
	private long startTimeStamp;
	private boolean isRunning;

	public boolean isRunning() {
		return isRunning;
	}

	public long getElapsedMilliseconds() {
		return getElapsedDateTimeTicks() / (1000L*1000L);

	}

	public long getElapsedNanoSeconds() {
		return getElapsedDateTimeTicks();
	}

	private long getElapsedDateTimeTicks() {
		long rawElapsedTicks = getRawElapsedTicks();

		return rawElapsedTicks;
	}

	private long getRawElapsedTicks() {
		long num = elapsed;
		if (isRunning) {
			long num2 = System.nanoTime() - startTimeStamp;
			num += num2;
		}
		return num;
	}

	public static Stopwatch startNew() {
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();
		return stopwatch;
	}

	public void stop() {
		if (isRunning) {
			long timestamp = System.nanoTime();
			long num = timestamp - startTimeStamp;
			elapsed += num;
			isRunning = false;
			if (elapsed < 0L) {
				elapsed = 0L;
			}
		}
	}

	public long stopGetElapsedMilliseconds() {
		stop();
		return getElapsedMilliseconds();
	}

	public long stopGetElapsedNanoSeconds() {
		stop();
		return getElapsedNanoSeconds();
	}

	public void start() {
		if (!isRunning) {
			startTimeStamp = System.nanoTime();
			isRunning = true;
		}
	}

	public void reset() {
		elapsed = 0L;
		isRunning = false;
		startTimeStamp = 0L;
	}

	public void resetStart() {
		reset();
		start();
	}

}
