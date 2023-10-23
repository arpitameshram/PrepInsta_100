class HCFDemo
{
	public static void main(String args[])
	{
		int num1 = 12, num2 = 36, hcf = 0;

		for(int i = 1; i<= num1 || i <= num2; i++)//Loop through all the numbers from 1 up to the smaller of the two numbers (num1 and num2).
		{
			if(num1 % i == 0 && num2 % i == 0)//Check if both num1 and num2 are divisible by the current value of 'i'.
			{
				hcf = i;//If 'i' divides both num1 and num2, update the HCF to 'i'.
			}
	
		}
		System.out.println("The HCF is  : "+hcf);
	}
}