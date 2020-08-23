
//print the index which has equal value in the left and right;
import java.util.Arrays;
class B19
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,1,5,6,5,7,4,8,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
		//output should be  1,4,9
		System.out.println("array constant:" + Arrays.toString(x));
         
		 for(int i = 1; i < x.length -1; i++)
		{
			 if(x[i-1] == x[i+1])
			{
				 System.out.println(i + ",");
			}
		}
	}

}
        