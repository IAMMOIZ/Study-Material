/*
9. Find out the min value from all even indexed 
elements from a given int array?

*/
class I
{
	public static void main(String[] args) 
	{
		int[] x = {100, 4, 8, 20, 6, 11, 15};
		int min = x[0];
		for(int i = 2; i < x.length; i = i + 2)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		System.out.println("min:" + min);
	}
}
