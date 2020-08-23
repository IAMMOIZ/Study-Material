//remove elements of one array from another array;
/*
example
initial array content :
first array : {1,20,3,1,61,3,19,7,61,9,80}
second array content :  {50,61,3,45,1}
final array content :
first array : {20,19,7,9,80}
second array : {50,61,3,45,1}

*/
import java.util.Arrays;
class  B309
{
	public static void main(String[] args) 
	{
		int[] x ={1,20,3,1,61,3,19,7,61,9,80};
		//        0,1,2,3,4,5,6,7,8,9,10
		int[] y = {50,61,3,45,1};
	 
		System.out.println(" initial first array constant:" + Arrays.toString(x));
		System.out.println(" initial second array constant:" + Arrays.toString(y));
		 int count = 0;
		 for(int i= 0; i < y.length; i++)
		{
			 for(j = 0; j < (x.length - count); j++)
			{
				if(y[i] == x[j])
				{
					for(int k = j; k< (x.length - count - 1); k++)
					{
						x[k] = x[k+1];
					}
					j--;
					count ++;
				}
			}
		}
		int[] z = new int[x.length - count];
		for(int i = 0; i < z.length; i++)
		{
			z[i] = x[i];
		}
		System.out.println(" final first array constant:" + Arrays.toString(z));
		System.out.println(" final second array constant:" + Arrays.toString(y));
	    }
}


