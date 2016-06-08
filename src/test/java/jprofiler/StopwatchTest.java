package jprofiler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

import com.github.uninxc.profiler.utils.Stopwatch;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StopwatchTest  {

	@Test
	public void testStopwatch() throws InterruptedException{
		
		Stopwatch sw = Stopwatch.startNew();
		Thread.sleep(1000);
		sw.stop();
		
		assertTrue((sw.getElapsedMilliseconds()>990 ));
		assertTrue((sw.getElapsedMilliseconds()<1100 ));
		
	}

}
