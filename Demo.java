import java.util.*;

class Demo
{  
	static boolean isPerfectSquare(int x) 
	{   
	  // Find floating point value of  
	  // square root of x. 
	  double sr = Math.sqrt(x); 
	  
	  // If square root is an integer 
	  return ((sr - Math.floor(sr)) == 0); 
	} 
	public static void main(String [] args )
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] mat = new int[n][n] ;
		for(int i = 0 ; i < n ; i++ )
		{
			for( int j = 0 ; j < n ; j++ )
			{
				mat [i][j] = sc.nextInt();
			}
		}
		int ans = Integer.MAX_VALUE ;
		for(int i = 0 ; i < n ; i++ )
		{
			int ctr = 0;
			for(int j = 0 ; j < n  ; j++ )
			{
				ctr += checkForCondition(mat[i][j]);
			}
			ans = Math.min(ans, ctr);
		}
		for(int i = 0 ; i < n ; i++ )
		{
			int ctr = 0;
			for(int j = 0 ; j < n  ; j++ )
			{
				ctr += checkForCondition(mat[j][i]);
			}
			ans = Math.min(ans, ctr);
		}
		System.out.println(ans);
		sc.close();
	}
	private static int checkForCondition(int i) {
		int t = i;
		int ans = Integer.MAX_VALUE ;
		int ctr = 0;
		
		while(!isPerfectSquare(1+ (8 *t)))
		{
			t++;
			ctr++;
			
		}
		ans = Math.min(ans, ctr);
		
		ctr = 0;
		t = i;
		while(!isPerfectSquare(1+ (8 *t)))
		{
			t--;
			ctr++;
			
		}
		ans = Math.min(ans, ctr);
		
		return ans;
	}

}
