//get array size and array element from the user . find the smallest element
//by definning new function
#include<stdio.h>
int small(int *, int);
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
	printf("Smallest element is : %d ",small(arr,size));
}
int small(int *arr, int size)
{
	int small=arr[0],index=1;
	for(index=1;index<size;index++)
	{
		if(arr[index]<small)
			small=arr[index];
	}
	return small;	
}