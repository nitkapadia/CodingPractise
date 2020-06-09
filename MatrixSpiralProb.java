
public class MatrixSpiralProb {

	public static void main(String[] args) {
		int arr[][]= {{10, 11, 12, 13, 14, 15}, 
                      {27, 29, 30, 31, 32, 16}, 
                      {28, 40, 41, 42, 33, 17}, 
                      {27, 39, 44, 43, 34, 18},
                      {26, 38, 37, 36, 35, 19},
                      {25, 24, 23, 22, 21, 20},
		}; 
		int i=0;
		int j=0;
		int k=0;
		for(int m=0;m<4;m++)
		{    
			
			for(;j<((arr.length)-k);j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			//System.out.println("i value " + i+ " "+"j value "+j);
			j=j-1;
			i=i+1;
			//System.out.println("i value " + i+ " "+"j value "+j);
			
			for(;i<((arr.length)-k);i++)
			{
				System.out.print(arr[i][j]+" ");
			}
			i=i-1;
			j=i-1;
			
			
			for(;j>=k;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			j=j+1;
			i=i-1;
			k++;
			for(;i>=k;i--)
			{
				System.out.print(arr[i][j]+" ");
			}
			j=j+1;
			i=i+1;
			
		}

	}

}
