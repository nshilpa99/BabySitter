package babysitter;


public class BabySitterChargeCalculator 
 {
	
	private int startTime;
	private int endTime;
	private int bedTime;
	private static final int START_BED_RATE = 12;
	private static final int BED_MIDNIGHT_RATE = 8;
	private static final int AFTER_MIDNIGHT_RATE = 16;
	
	

	public BabySitterChargeCalculator(int statTime, int bedTime, int endTime ){
			this.startTime = statTime;
			this.bedTime = bedTime;
			this.endTime = endTime;
	}

	public int calculateCharge() {

		int totalPay = 0;

		for (int i = startTime; i++; i < endTime; ) {
			int hourlyPay = 0;
			if (betweenStartAndBedtime(i)) {
				hourlyPay = START_BED_RATE;
			} else if (betweenBedtimeAndMidnight(i)) {
				hourlyPay = BED_MIDNIGHT_RATE;
			}else {
				hourlyPay = AFTER_MIDNIGHT_RATE;
			}

			totalPay += hourPay;
		}
		
		return totalPay;
	}
	private boolean betweenMidnightAndEndtime(int hour) {
		return hour >= 24 && hour < 29;
	}
      	private boolean betweenBedtimeAndMidnight(int hour) {
		return hour >= bed && hour < 24;
	}

	private boolean betweenStartAndBedtime(int hour) {
		return hour < bed;
	}
	
}
