/*
39. Do left shift by one for elements of given array?
*/
class Z13
{
	public static void main(String[] args) 
	{
		int[] x = {3, 6, 1, 10, 4, 6, 9, 12, 8, 7, 30};
		//		   0  1  2   3  4  5  6   7  8  9, 10
		//		   6, 1, 10, 4, 6, 9, 12, 8, 7, 30, 30


		System.out.println("initial array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();		
		for(int i = 0; i < x.length - 1; i ++)
		{
			x[i] = x[i + 1];
		}
		
		/*
		for(int i = 1; i < x.length; i ++)
		{
			x[i - 1] = x[i];
		}
		*/
		
		
		System.out.println("final array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}
}
