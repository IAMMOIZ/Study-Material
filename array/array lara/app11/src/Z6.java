/*
32. Reverse only last half of the elements of given array?
*/
class Z6
{
	public static void main(String[] args) 
	{
		int[] x = {3, 6, 1, 10, 4, 6, 9, 12, 8, 7};
		//		   0  1  2   3  4  5  6   7
		System.out.println("initial array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();		
		for(int i = (x.length / 2), j = 0; 
			i < (x.length / 2 + (x.length - x.length/2)/2); 
			i++, j++)
		{
			x[i] = x[i] + x[x.length - j - 1];
			x[x.length - j - 1] = x[i] - x[x.length - j - 1];
			x[i] = x[i] - x[x.length - j - 1];
		}
		
		System.out.println("final array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}
}
