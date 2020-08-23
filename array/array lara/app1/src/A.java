import java.util.Arrays;
class  A
{
	public static void main(String[] args) 
	{
		int[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		System.out.println("Arrays constant:" + Arrays.toString(x));
		System.out.println("even number:");
		for(int i =0 ; i < x.length;i++)
		{
			if(x[i] % 2 == 0)
			{

		System.out.print(x[i]+ ",");
			}
		}
	}
}