/*
17. Find out the max value from a first half 
	of given int array?
*/
class Q1
{
	public static void main(String[] args) 
	{
		int[] x = {3, 6, 1, 10, 4, 6, 9};
		//middle in the 2nd half.
		int max = x[0];
		for(int i = 1; i < x.length / 2; i++)
		{
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		System.out.println("max in the first half:" + max);
	}
}
