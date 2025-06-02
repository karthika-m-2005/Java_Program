public class nthprime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter he  number:");
		int input1= sc.nextInt();
		int result = nthprime(input1);
		System.out.println(result);
}	
	public static int nthprime(int input1) {
		int count = 0;
        int number = 1;

        while (count < input1) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
