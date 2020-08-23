 //develop third array with every elements of given two array.
 /*
 
example
 first arrays content : {3,7,15,9,1,12,5};
 second array content : {45,50,60,55}
 third array  : {3,7,15,9,1,12,5,45,50,60,55};
*/
import java.util.Arrays;
class  B44
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
			 for(int i = 0 ; i < y.length ; i++)
			{
				 z[x.length + i] =  y[i];
			}
					 
	 
		System.out.println(" third array constant:" + Arrays.toString(z));
	    }
}


