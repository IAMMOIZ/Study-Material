
//swap even indexed element with immediate odd indexed element;
import java.util.Arrays;
class B22
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
		//output should be  2,3,6,9
		System.out.println("array constant:" + Arrays.toString(x));
		 for(int i = 0; i < x.length - 1; i += 2)
		{
			 int temp = x[i];
			 x[i] = x[i+1];
			 x[i+1] = temp;
		}
		System.out.println(" final array constant:" + Arrays.toString(x));
		
	}

}
        