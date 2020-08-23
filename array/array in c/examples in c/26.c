//get array size and element from user
//get new element from user and insert at first index
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
	printf("-----------------\n");
	//get new element from user
	printf("Enter new element : ");
	scanf("%d",&newEle);
	//logic for right shifting all element of array 
	for(index=size-1;index>=0;index--)
	{
		arr[index+1]=arr[index];
	}
	arr[0]=newEle;
	size++;
	printf("------------------------\nnew array is \n");
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	return 0;
}