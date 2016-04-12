package babysitter;


public class BabySitter 
 {

	private int allowableStartTime;
	private int allowableEndTime;
	private int allowableBedTime;
	
	private int startTime;
	private int endTime;
	private int bedTime;

	private int 24HrFormatStartTime;
	private int 24HrFormatEndTime;
	private int 24HrFormatBedTime;
	
	private int nightlyCharge;

       public BabySitter(){
		this.allowableStartTime = 17;
		this.allowableBedTime = 20;
		this.allowableEndTime = 4;
	}
	public BabySitter(int statTime, int bedTime, int endTime ){
		if(validateAllowableTimePeriod(statTime, endTime)){
			this.startTime = statTime;
			this.bedTime = bedTime;
			this.endTime = endTime;
			this.24HrFormatStartTime = convertTimeTo24HourFormatToCalculateCharge(statTime);
			this.24HrFormatBedTime  = convertTimeTo24HourFormatToCalculateCharge(bedTime);
			this.24HrFormatEndTime = convertTimeTo24HourFormatToCalculateCharge(endTime);
			BabySitterChargeCalculator calc = new BabySitterChargeCalculator(24HrFormatStartTime, 24HrFormatBedTime,  24HrFormatEndTime);
			int nightlyCharge = calculateCharge();
		}
		else{
			throw new NotAllowableTimeRangeException(“Invalid time specified”);
		}
	}

	private boolean validateAllowableTimePeriod(int startTime, int endTime) {
        if (startTime < getAllowableStartTime() && startTime > getAllowableEndTime()){
            return false;
        } else if (endTime < getAllowableStartTime() && endTime > getAllowableEndTime()) {
            return false;
        }else{
	     return true;
	 }
    	}
	
	private int convertTimeTo24HourFormatToCalculateCharge(int hour) {
        	if (hour >= 0 && hour <= 4) {
            		hour += 24;
        	}
        	return hour;
    	}


       public String get24HrFormatStartTime() {
		return 24HrFormatStartTime;
	}
	public String get24HrFormatEndTime() {
		return 24HrFormatEndTime;
	}

	public String get24HrFormatBedTime() {
		return 24HrFormatBedTime;
	}
	public String getAllowableStartTime() {
		return allowableStartTime;
	}
	public String getAllowableEndTime() {
		return allowableEndTime;
	}

	public String getAllowableBedTime() {
		return allowableBedTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public String getEndTime() {
		return endTime;
	}

	public String getBedTime() {
		return bedTime;
	}
	public String getNightlyCharge() {
		return nightlyCharge;
	}
	
}
