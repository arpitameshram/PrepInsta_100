
import java.util.Scanner;


class Factors {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int num,i;
		
		System.out.print("Enter the number : ");
	      num= sc.nextInt();
	      System.out.print("The factors of " + num + " are: ");
	      for (i = 1; i <= num; ++i) {
	         if (num % i == 0) {
	            System.out.print(i + " ");
	         }
	      }
	   }
	}