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
		this.startTime = statTime;
		this.bedTime = bedTime;
		this.endTime = endTime;
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
