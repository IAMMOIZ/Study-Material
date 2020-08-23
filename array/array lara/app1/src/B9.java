
import java.util.Arrays;
class B9
{
	public static void main(String[] args) 
	{
		int[] x ={12,30,500,55,5,35,50,2,0,34};
		System.out.println("array constant:" + Arrays.toString(x));
		for(int i =0 ; i < x.length;i+=2)
		{
		System.out.print(x[i]+ ",");
			}
		}
	}