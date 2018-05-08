package Models;

public class Job{
	private String name,classType, start, end, time;
	private int numOfStaff;
	private double payRate;

	public Job(String name,String classType ,String start, String end, String time,
			int numOfStaff, double payRate) {
		this.name = name;
		this.classType=classType;
		this.start = start;
		this.end = end;
		this.time = time;
		this.numOfStaff = numOfStaff;

		this.payRate = payRate;
	}

	public String getName() {
		return name;
	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	public String getTime() {
		return time;
	}

	public int getNumOfStaff() {
		return numOfStaff;
	}

	public double getPayRate() {
		return payRate;
	}
	
	public void printInfo()
	{
		System.out.print("Course:"+this.name);
		System.out.print(" Class Type:"+this.classType);
		System.out.print(" Start: "+this.start);
		System.out.print(" End : "+this.end);
		System.out.print(" Time : "+this.time);
		System.out.print(" Number required: "+this.numOfStaff);
		System.out.println(" Pay rate: "+this.payRate);
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}
}
