
//left rotate shift by one;
/*
example
initial array constant : (1,2,3,5,6,3,9,7,2,9,8);
finial array constant  : (2,3,5,6,3,9,7,2,9,8,1)

*/
import java.util.Arrays;
class B26
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
	 
		System.out.println(" initial array constant:" + Arrays.toString(x));
		int temp = x[0];
		for(int i = 0; i< x.length-1;i++)
		{
			x[i] = x[i+1];
		}
		x[x.length - 1] = temp;

	 
		System.out.println(" final array constant:" + Arrays.toString(x));
		
	}
}