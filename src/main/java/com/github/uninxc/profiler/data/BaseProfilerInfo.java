package com.github.uninxc.profiler.data;

public class BaseProfilerInfo {

	private long times;
	
	private long maxDuration;
	
	private long minDuration;
	
	private long avgDuration;

	public long getTimes() {
		return times;
	}

	public void setTimes(long times) {
		this.times = times;
	}

	public long getMaxDuration() {
		return maxDuration;
	}

	public void setMaxDuration(long maxDuration) {
		this.maxDuration = maxDuration;
	}

	public long getMinDuration() {
		return minDuration;
	}

	public void setMinDuration(long minDuration) {
		this.minDuration = minDuration;
	}

	public long getAvgDuration() {
		return avgDuration;
	}

	public void setAvgDuration(long avgDuration) {
		this.avgDuration = avgDuration;
	}
	
	
}
