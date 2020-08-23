
//remone all the even number from the  int array;
/*
example
initial array constant : (1,20,3,5,61,3,19,7,22,9,80);
finial array constant  : (1,3,5,61,3,19,7,9);


*/
import java.util.Arrays;
class B37
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
	 
		System.out.println(" initial array constant:" + Arrays.toString(x));
		 int count = 0;
		 for(int i= 0; i < x.length; i++)
		{
			 if(x[i] % 2 == 0)
			{
				count++;
			}
		}
		  int[] y = new  int[x.length  - count];
		  for(int i = 0, j= 0; i < x.length; i++)
		{
			  if(x[i] % 2 != 0)
			{
			  y[j++] = x[i];
			}
		}

	 
		System.out.println(" final array constant:" + Arrays.toString(y));
		
	}
}