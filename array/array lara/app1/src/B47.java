 //develop third array with every elements of given two array.
 //note: consider both array element one by one.
 //first array ==> left to right
 //second array ==> right to left
 /*
 
example
 first arrays content : {3,7,15,9,1,12,5};
 second array content : {45,50,60,55}
 third array  : {3,55,7,60,15,50,9,45,1,12,5};
*/
import java.util.Arrays;
class  B47
{
	public static void main(String[] args) 
	{
		 
		int[] x = {3,7,15,9,1,12,5};
		int[] y = {45,50,60,55};
		System.out.println(" initial second array constant:" + Arrays.toString(x));
		System.out.println(" initial second array constant:" + Arrays.toString(y));

		int size = x.length + y.length ;
		int[] z = new int[size];
		 for(int i = 0, j = y.length - 1, k = 0; (i < x.length || j >= 0); i++, j--)
		{
			 if(i < x.length)
			{
				 z[k++] = x[i];
			}
			if(j >= 0)
			{
				z[k++] = y[j];
			}
			  
		}
			 
	 
		System.out.println(" third array constant:" + Arrays.toString(z));
	    }
}


