package babysitter;

import static org.junit.Assert.*;
import org.unit.test;

public class BabySitterTest
 {
       
       
	@Test
	public void getBabySitterMinimumStartTimeAndMaximumEndTime(){
		BabySitter babySitter = new BabySitter();
		int startTime = babySitter.getAllowableStartTime();
		int endTime = babySitter.getAllowableEndTime();
		assertEquals(17, startTime);
		assertEquals(4, endTime);

	}

	@Test
	public void acceptsBabySittersNewStartTimeAndEndTimeIfWithinAllowableTimeRange(){
		BabySitter babySitter = new BabySitter(18, 20, 4);
		assertEquals(18, babySitter.getStartTime());
		assertEquals(20, babySitter.getBedTime());
		assertEquals(4, babySitter.getEndTime());

	}

	@Test(expected = NotAllowableTimeRangeException.class)	
	public void startTimeNotWithinAllowableTimeRangeThrowsException(){
		BabySitter babySitter = new BabySitter(14, 20, 1);

	}
	@Test(expected = NotAllowableTimeRangeException.class)	
	public void endTimeNotWithinAllowableTimeRangeThrowsException(){
		BabySitter babySitter = new BabySitter(19, 20, 5);

	}
	@Test
	public void get24HrFormatForStartTimeToCalculateCharge(){
		BabySitter babySitter = new BabySitter(18, 20, 4);
		assertEquals(18, babySitter. get24HrFormatStartTime());

	}
	@Test
	public void get24HrFormatForBedTimeToCalculateCharge(){
		BabySitter babySitter = new BabySitter(18, 20, 4);
		assertEquals(20, babySitter. get24HrFormatBedTime());

	}
	@Test
	public void get24HrFormatForEndTimeToCalculateCharge(){
		BabySitter babySitter = new BabySitter(18, 20, 4);
		assertEquals(28, babySitter. get24HrFormatEndTime());

	}
	@Test
	public void ifStartTimeIsSixPMAndEndTimeIs8PMChargeCalculatorUsesHourlyRateAs12(){
		BabySitter babySitter = new BabySitter(18, 20, 20);
		assertEquals(24, babySitter. getNightlyCharge());

	}
	@Test
	public void ifStartTimeIsFivePMAndEndTimeIs8PMChargeCalculatorUsesHourlyRateAs12(){
		BabySitter babySitter = new BabySitter(17, 20, 20);
		assertEquals(24, babySitter. getNightlyCharge());

	}


}
