package AlgorithmObli;

public class Alg3 {

	public static void main(String[] args) {

		testAlgo3(8);
		
			
		}
	

	public static void Algo3(int n) {
		int k = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				k = j;
				
				while (k <= n) {
					k = k *3;
					
				}
			}
		}
	}
	
	public static void testAlgo3(int n)
	{
		long startTime;
		long endTime;
		double durr;
		for(int i=1;i<=n;i++)
		{
			System.out.println(1000*(Math.pow(2, i)));
		startTime = System.nanoTime();
		Algo3((int) (1000*(Math.pow(2, i))));
		endTime = System.nanoTime();
		durr= endTime-startTime;
		System.out.println(i+": "+durr/1000000000+"s");
	}
	}
}
