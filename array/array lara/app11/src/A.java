//1. Find the sum of all given elements from an int array?
class A 
{
	public static void main(String[] args) 
	{
		int[] x = {10, 4, 8, 20, 6, 11, 15};
				 // 0  1  2   3  4   5   6
		int sum = 0;
		/*
		sum += x[0];
		sum += x[1];
		sum += x[2];
		sum += x[3];
		sum += x[4];
		sum += x[5];
		sum += x[6];
		*/
		for(int i = 0; i < x.length; i++)
		{
			sum = sum + x[i];   // sum += x[i];
		}
		System.out.println("sum:" + sum);
	}
}
