
class Boxes
{
	
	int length;  //instance variable
	int breath;
	int height;
	
	
    Boxes(int l,int b,int h)   //constractor
    {
    	length = l;
    	breath = b;
    	height = h;
    	
    }
    
    void setdim(int l,int b,int h)   //set dimensional
    {
    	length = l;
    	breath = b;
    	height = h;
    }
    int Volume()
    {
		return length*breath*height;
    }
	
    
    
}




class constractor {    //main class
	public static void main(String args[]) {
	
		Boxes blackbox = new Boxes(2,3,4);
	  System.out.println(	blackbox.Volume());
		blackbox.setdim(2, 2, 2);
		System.out.println(blackbox.Volume());
		
	}

}
