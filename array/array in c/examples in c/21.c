//get array size and array element from the user 
//right shift of array element 
#include<stdio.h>
int main()
{
	int size,index,temp;
	printf("Enter size of  array : ");
	scanf("%d",&size);
	int arr[size];
	printf("enter array elements_________\n");
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	//logic of left sifting
	for(index=size-2;index>=0;index--)
	{
		//next ko  previous ki assign kro
		arr[index+1]=arr[index];
	}
	//print array 
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	


	return 0;
	}

