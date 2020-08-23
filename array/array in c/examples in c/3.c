//get array size and array element from the user 
#include<stdio.h>
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
	for(index=0;index<size;index++)
	{
		printf("a[%d] : %d \n",index,arr[index]);
	}
	
	
}