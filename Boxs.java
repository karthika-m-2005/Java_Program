
class Boxs {

	
	int length;
	int breath;
	int height;
	char m;
	char n;
	
}
class Box
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Boxs blackBox = new Boxs();
		Boxs whiteBox = new Boxs();
		
		blackBox.length = 13;
		blackBox.breath = 15;
		whiteBox.length = 25;
		whiteBox.breath = 35;
		blackBox.m = 'c';
		
		System.out.println(blackBox.length);
		System.out.println(blackBox.breath);
		System.out.println(whiteBox.length);
		System.out.println(whiteBox.length);
		System.out.println(blackBox.m);
		System.out.println(blackBox.n);
    }
}

