package AlgorithmObli;

public class TabelSjov {
	public int TabelSjov(int A[]) {
		int n=A.length;
		for (int i=0; i<n-1;i++){
			System.out.println(i);
			for (int j=0;j<n-1;j++){
				System.out.println(i);
				for (int k=0;k<n-1;k++)
				{
					if (A[i]+A[j]+A[k]==0)
						System.out.println("i:"+i+" j:"+j+" k:"+k);
						return i+j+k;
				}
			}
		}
		return -1;


	}
}
