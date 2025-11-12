// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[])
	 {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 1;
	if(mode.equals("v")){
		System.out.print(seed + " ");
		int sum = 1;
		do{
			if(seed % 2 == 0){
				seed = seed / 2;
				sum++;
			} else{
				seed = seed * 3 + 1;
				sum++;
			}
			System.out.print(seed + " ");
		}while(seed != 1); 
		System.out.print("(" + sum + ")");
		
		sum = 1;
		System.out.println();
		for (int i = 1; i < N; i++){
			seed = i+1;

			System.out.print(seed + " ");
			while(seed != 1){
			if(seed % 2 == 0){
				seed = seed / 2;
				sum++;
			} else{
				seed = seed * 3 + 1;
				sum++;
			}
		
			System.out.print(seed + " ");
		}
		
		System.out.print("(" + sum + ")");
		System.out.println();
		sum = 1;

	}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
} else{
	System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
}

}
}
