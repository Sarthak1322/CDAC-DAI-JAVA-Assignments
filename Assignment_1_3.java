package Day1;

// 2. Create getter - setter methods for Date class
// assume Assignment_1_3 = date
public class Assignment_1_3 {
	protected int day;
	protected String month;
	protected int year;
	public Assignment_1_3(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
