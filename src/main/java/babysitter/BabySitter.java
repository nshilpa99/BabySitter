package babysitter;


public class BabySitter 
 {

	private int allowableStartTime;
	private int allowableEndTime;
	private int allowableBedTime;
	
	private int startTime;
	private int endTime;
	private int bedTime;

	
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
	
}
