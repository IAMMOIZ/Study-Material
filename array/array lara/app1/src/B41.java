//devolop third array with the uncommen element of given two array;
/*
example
initial array content :
first array : {1,20,3,1,61,3,19,7,61,9,80}
second array content :  {50,61,3,45,1}
final array content :
third array : {20,19,7,9,80}

*/
import java.util.Arrays;
class  B41
{
	public static void main(String[] args) 
	{
		int[] x ={1,20,3,1,61,3,19,7,61,9,80};
		//        0,1,2,3,4,5,6,7,8,9,10
		int[] y = {50,61,3,45,1};
	 
		System.out.println(" initial first array constant:" + Arrays.toString(x));
		System.out.println(" initial second array constant:" + Arrays.toString(y));

		int size = x.length + y.length ;
		int[] z = new int[size];
		 int count = 0;
		 boolean isAvailable = false;
		 for(int i = 0; i < x.length ; i++)
		{
			 for(int j = 0 ; j < y.length ; j++)
			{
				if(x[i] == y[j])
				{
					 isAvailable = true;
					 break;
				}
			}
					 
			if(!isAvailable)
					{
			     	z[count++] = x[i];
					}
			    	 isAvailable = false;
				    }

			for(int i = 0; i < y.length ; i++)
		    {
			 for(int j = 0 ; j < x.length ; j++)
			  {
				if(y[i] == x[j])
				{
					isAvailable = true;
					break;
				}
			}
					 
			if(!isAvailable)
					{
			     	z[count++] = y[i];
					}
			    	 isAvailable = false;
				    }
		int[] z1 = new int[count];
		for(int i = 0; i < z1.length; i++)
		{
			z1[i] = z[i];
		}
		System.out.println(" third array constant:" + Arrays.toString(z1));
	    }
}


