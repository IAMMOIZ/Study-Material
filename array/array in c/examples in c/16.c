//get array size and array element from the user 
// reverse array .
#include<stdio.h>
int main()
{
	int size,temp,index2;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],index;
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	//logic of reverse.
	for(index=0,index2=size-1;index<(size/2);index++,index2--)
	{
		temp=arr[index];
		arr[index]=arr[index2];
		arr[index2]=temp;
	}
	//print array elements
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}	return 0;
}
