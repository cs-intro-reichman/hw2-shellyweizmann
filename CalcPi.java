// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		double sum = 0; 

		int n = Integer.parseInt(args[0]);
		for (int i = 0; i<n; i++) 
		{
			int odd = 2*i+1; 
			double fraction = 1.0/odd;

			if(i%2==1) 
			{
				fraction = -fraction;
			}
			
			sum = sum + fraction; 

		}

		double pi = sum*4;

		System.out.println("pi according to Java: " + Math.PI); 
		System.out.println("pi, approximated: " + pi);
	}
}
