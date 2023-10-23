class EvenOdd1{
	public static void main(String args[])
	{
		int num = 28;

		String status = num % 2 == 0 ? " is even" : " is odd ";
		System.out.println(num + status);
	}
}
