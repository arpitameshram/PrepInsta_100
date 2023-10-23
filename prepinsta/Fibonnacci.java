

class Fibonnacci {
	  public static void main(String[] args) {

	    int n = 100, num1 = 0, num2= 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(num1 + ", ");

	      
	      int num3= num1 + num2;
	      num1 = num2;
	      num2 = num3;
	    }
	  }
	}