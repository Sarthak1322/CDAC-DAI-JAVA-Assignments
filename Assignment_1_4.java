package Day1;

/*
 *  Create a Student class with name and rollno
The rollno should be auto generated based on number of student objects created
Display the count of total students using displyStudentCount method


here let Assignment_1_4 be Student class
 */

public class Assignment_1_4 {
	
	protected String name;
	protected int rollno;
	protected static int count =0;
	public Assignment_1_4(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
		count++;
		
	}
	public static void main(String[] args) {
		
		Assignment_1_4 student1= new Assignment_1_4("Sarthak", 01);
		Assignment_1_4 student2= new Assignment_1_4("Sarth", 02);
		Assignment_1_4 student3= new Assignment_1_4("Sarth", 02);
		Assignment_1_4 student4= new Assignment_1_4("Sarth", 02);
		
		System.out.println("Number of Student " + count);
	}
	
	

}
