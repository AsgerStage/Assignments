package AlgorithmObli;

public class MissingNumber {

	public static void main(String[] args) {
		int[] A= new int[11];
	A[0]=1;
	A[1]=2;
	A[2]=3;
	A[3]=4;
	A[4]=5;
	A[5]=6;
	A[6]=8;
	A[7]=9;
	A[8]=10;
	A[9]=11;
	System.out.println(linearFind(A));
	
		
	}
	static int linearFind(int[] A){
		int count=0;
		for (int i=0;i<A.length;i++)
		{
			
			count =count +A[i];
			
		}
		
		return ((A.length*(A.length+1))/2)-count;
		
	}

	static int squareFind(int[] A){
		
		
		for (int i=0;i<A.length;i++){
			for (int j=0;i<A.length;i++)
			{
				if (i==A[j]){
					
					
				}
			}
		}
		
		return -1;
		
	}
	
}
