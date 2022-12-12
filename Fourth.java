
public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((i-j>=n/2)||(i+j>=n+n/2)||(i==n))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
