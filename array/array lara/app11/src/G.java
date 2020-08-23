/*
	7. Find out the sum of all even indexed elements 
	from a given int array?
*/
class G
{
	public static void main(String[] args) 
	{
		int[] x = {100, 4, 8, 20, 6, 11, 15};
		         // 0   1  2   3  4   5  6
		int sum = 0;
		for(int i = 0; i < x.length; i = i + 2)
		{
			sum += x[i];
		}
		System.out.println("sum:" + sum);
	}
}
