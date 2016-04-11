package babysitter;

import static org.junit.Assert.*;
import org.unit.test;

public class BabySitterTest
 {
	@Test
	public void getBabySitterMinimumStartTimeAndMaximumEndTime(){
		BabySitter babySitter = new BabySitter();
		int startTime = babySitter.getStartTime();
		int endTime = babySitter.getEndTime();
		assertEquals(17, startTime);
		assertEquals(4, endTime);

	}
	
	
}
