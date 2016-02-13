package AlgorithmObli;

public class Test {
	static int TabelSjov(int A[], int n) {

		
		for (int i = 0; i < n-1; i++) {
			System.out.println("i: "+i);
			for (int j = 0; j < n-1; j++) {	
				System.out.println("j: "+j);
				for (int k = 0; k < n-1; k++) {
					System.out.println("k: "+k);
					if (A[i] + A[j] + A[k] == 0){
						System.out.println("i:" + i + " j:" + j + " k:" + k);
					return -2;}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] tabel;
		
			
			tabel = new int[10];
			for (int i=0;i<10;i++){
				tabel[i]=(int)(Math.random()*10);
				System.out.println(tabel[i]);
			}

		
		System.out.println(TabelSjov(tabel,10));
	}
}
