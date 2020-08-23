//
import java.util.Arrays;
class B11
{
	public static void main(String[] args) 
	{
		int[] x ={12,30,500,55,5,35,50,2,0,34};
		System.out.println("array constant:" + Arrays.toString(x));
		System.out.println("in the reverse order:");

		for(int i =x.length-1 ; i >= 0; i--);
		{
			System.out.print(x[i] + ",");
		}
		System.out.println();
		System.out.println("finally array content:"+ Arrays.toString(x));
		 
	}
}

//print first half and second half separately