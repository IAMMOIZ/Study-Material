//get array size and element from user
//delete first element of array
//we always use left shift in delete opration of array element
#include<stdio.h>
int main()
{
	int size;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],newEle,index;
	for(index=0;index<size;index++)
	{
		printf("Enter element of array : ");
		scanf("%d",&arr[index]);
	}
	//logic of left shift of array.
	for(index=0;index<size-1;index++)
	{
		arr[index]=arr[index+1];
	}
	//if you delete one element then decrease array size by one.
	size--;
	printf("------------------------\nnew array is \n");
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	return 0;
}