
//remone all the single digit element from the array;
/*
example
initial array constant : (1,26,3,5,62,3,19,7,22,9,80);
finial array constant  : (20,62,19,22,80);


*/
import java.util.Arrays;
class B36
{
	public static void main(String[] args) 
	{
		int[] x ={1,26,3,5,62,3,19,7,22,9,80};
		//        0,1,2,3,4,5,6,7,8,9,10
	 
		System.out.println(" initial array constant:" + Arrays.toString(x));
		 int count = 0;
		 for(int i= 0; i < x.length; i++)
		{
			 if(x[i] < 10)
			{
				count++;
			}
		}
		  int[] y = new  int[x.length  - count];
		  for(int i = 0, j= 0; i < x.length; i++)
		{
			  if(x[i] >= 10)
			{
			  y[j++] = x[i];
			}
		}

	 
		System.out.println(" final array constant:" + Arrays.toString(y));
		
	}
}