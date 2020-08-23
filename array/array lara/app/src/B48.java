 //develop third array with first array and 2nd array is the reverse order.
 
 /*
 
example
 first arrays content : {3,7,15,9,1,12,5};
 second array content : {45,50,60,55}
 third array  : {3,7,15,9,1,12,5,55,60,50,45};
*/
import java.util.Arrays;
class  B48
{
	public static void main(String[] args) 
	{
		 
		int[] x = {3,7,15,9,1,12,5};
		int[] y = {45,50,60,55};
		System.out.println(" initial second array constant:" + Arrays.toString(x));
		System.out.println(" initial second array constant:" + Arrays.toString(y));

		int size = x.length + y.length ;
		int[] z = new int[size];
		 for(int i = 0; i < x.length ; i++)
		{
			 z[i] = x[i];
		}
			 for(int i = y.length -1 ; i >= 0 ; i--)
			{
				 z[x.length + i] =  y[y.length-i-1];
			}
			 
	 
		System.out.println(" third array constant:" + Arrays.toString(z));
	    }
}


