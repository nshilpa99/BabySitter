package babysitter;


public class BabySitter 
 {

	private int startTime;
	private int endTime;
	private int bedTime;
	
       public BabySitter(){
		this.startTime = 17;
		this.bedTime = 20;
		this.endTime = 4;
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
