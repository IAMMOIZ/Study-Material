/*
42. Do right rotate by one for elements of given array?
*/
class Z16
{
	public static void main(String[] args) 
	{
		int[] x = {3, 6, 1, 10, 4, 6, 9, 12, 8, 7, 30};
		//		   0  1  2   3  4  5  6   7  8  9, 10
		//		   30, 3, 6, 1, 10, 4, 6, 9, 12, 8, 7


		System.out.println("initial array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();		
		int temp = x[x.length - 1];
		for(int i = x.length - 1; i > 0; i --)
		{
			x[i] = x[i - 1];
		}
		x[0] = temp;
		System.out.println("final array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}
}
