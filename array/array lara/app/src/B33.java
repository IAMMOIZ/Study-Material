
//remove an element at index 4th  and 5th.
/*
example
initial array constant : (1,2,3,5,6,3,9,7,2,9,8);
finial array constant  : (1,2,3,5,9,7,2,9,8);


*/
import java.util.Arrays;
class B33
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
	 
		System.out.println(" initial array constant:" + Arrays.toString(x));
		 for(int i = 4; i < x.length- 2; i++)
		{
			 x[i] = x[i + 2];
		}
		int[] y = new int[x.length - 2];
		for(int i = 0; i < y.length ; i++)
		{
			y[i] = x[i];
		}
		  

	 
		System.out.println(" final array constant:" + Arrays.toString(x));
		
	}
}