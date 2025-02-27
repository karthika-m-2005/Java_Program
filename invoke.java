import java.util.Scanner;

class Demo {
	int h;
	int l;
	
	int surfaceArea()
	{
		return h*l;
	}
}
class invoke
{

	public static void main(String[] args)
     {
    	 
	 Scanner sc = new Scanner(System.in);
	 Demo box = new Demo();
	 System.out.println("Enter the Height: ");
	 box.h = sc.nextInt();
	 System.out.println("Enter the Length: ");
	 box.l = sc.nextInt();
	 System.out.println("SurfaceArea : "+box.surfaceArea());
	 sc.close();
	 
     }
	
	
}


