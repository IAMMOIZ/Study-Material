
//right rotate shift by one;
/*
example
initial array constant : (1,2,3,5,6,3,9,7,2,9,8);
finial array constant  : (1,1,2,3,5,6,3,9,7,2,9);

*/
import java.util.Arrays;
class B27
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
	 
		System.out.println(" initial array constant:" + Arrays.toString(x));
		for(int i = x.length-1; i>0;i--)
		{
			x[i] = x[i-1];
		}
		 
	 
		System.out.println(" final array constant:" + Arrays.toString(x));
		
	}
}