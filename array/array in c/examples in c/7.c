//get array size and array element from the user 
// find the second large element of array
#include<stdio.h>
int secondlarge(int* , int );
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
	printf("second large element of array : %d ",secondlarge(arr,size));
}
int secondlarge(int *arr, int size)
{
	int large=arr[0],slarge=arr[0],index;
	for(index=1;index<size;index++)
	{
		if(arr[index]>large)
			large=arr[index];
	}
	for(index=0;index<size;index++)
	{
		if(arr[index]>slarge && arr[index]<large)
			slarge=arr[index];
	}
	return slarge;	
}