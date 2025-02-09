

class Students
{
	String name;;
	int roll_no;
	int[] marks;
	
	Students(String name,int roll_no,int[] marks)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
	}
	
	int markstotal()
	{
		int total=0;
		for(int mm : marks)
		{
			total += mm;
		}
		return total;
	}
	
	void StudentDisplay()
	{
		System.out.println("=====================");
		System.out.println("Name: "+name);
		System.out.println("Roll_No: "+roll_no);
		System.out.println("Total Marks: "+markstotal());
		System.out.println("=====================");
	}
	
}

public class Marks {

	public static void main(String[] args) {
	
		Students person1 = new Students("Karthika",12348,new int[]{2,3,4,5,6});
		Students person2 = new Students("Arun",122339,new int[]{1,23,45,6,7});
		
		person1.StudentDisplay();
		person2.StudentDisplay();
		
		
		

	}

}
