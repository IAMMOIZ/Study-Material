
//print the index which has value of previous two value sum;
import java.util.Arrays;
class B20
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
		//output should be  2,3,6,9
		System.out.println("array constant:" + Arrays.toString(x));
         
		 for(int i = 2; i < x.length ; i++)
		{
			 if(x[i] == x[i-1]+x[i-2])
			{
				 System.out.print(i + ",");
			}
		}
	}

}
        