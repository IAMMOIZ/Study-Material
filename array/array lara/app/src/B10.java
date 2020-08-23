import java.util.Arrays;
class B10
{
	public static void main(String[] args) 
	{
		int[] x ={12,30,500,55,5,35,50,2,0,34};
		System.out.print("array constant:" + Arrays.toString(x));
		System.out.println("first half:");

		for(int i = 0 ; i < x.length/2; i++);
		{
			System.out.print(x[i] + ",");
		}
		System.out.println();
		System.out.println("second half:");
		for(int i = x.length /2; i < x.length; i++)
		{
			System.out.print(x[i]+",");
		}
	}
}

//print first half and second half separately