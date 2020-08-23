//get array size and array element from the user . find the largest element
//by definning new function
#include<stdio.h>
int large(int *, int);
int main()
{
	int size;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],index;
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	printf("Largest element is : %d ",large(arr,size));
}
int large(int *arr, int size)
{
	int large=arr[0],index=1;
	for(index=1;index<size;index++)
	{
		if(arr[index]>large)
			large=arr[index];
	}
	return large;	
}