class Greatest{
	public static void main(String args[])
	{
		int num1 = 50, num2 = 10, temp;
		if(num1 == num2)
			System.out.println("Both are Equal");
		else
		{
			temp = num1> num2 ? num1 : num2;
			System.out.println(temp + " is gretest");
		}
	}
}
