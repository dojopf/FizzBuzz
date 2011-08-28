




package br.com.dojo1;

public class FizzBuzz 
{

	public static String execute(int n) 
	{
		String result = "";

		for (int i = 1; i <= n; i++) 
		{
			
			if (i % 3 != 0 && i % 5 !=0)
				result += i;

			if (i % 3 == 0)
				result += "Fizz";
			
			if (i % 5 == 0)
				result += "Buzz";

			
			if (i != n)
				result += ",";
		}
		if (n == 0)
		    result = "valor nao pode ser zero";
		if (n < 0)
		    result = "valor nao pode ser negativo sua anta peluda!!!";	
		return result;
	}
}










