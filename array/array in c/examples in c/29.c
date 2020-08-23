//get array size and element from user
//delete multiple element of array on  specific indexes
//we always use left shift in delete opration of array element
#include<stdio.h>
void delete(int *arr,int *size,int index1)
{
	int i,index;
	for(i=index1;i<*size-1;i++)
	{
		arr[i]=arr[i+1];
	}
	*size=*size-1;
}

int main()
{
	int size,num,i,index1;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],newEle,index;
	for(index=0;index<size;index++)
	{
		printf("Enter element of array : ");
		scanf("%d",&arr[index]);
	}
	//get number of elements you want to delete
		printf("Insert number of element delete from array : ");
		scanf("%d",&num);
	//get index and delete element of those index
	for(i=0;i<num;i++)
	{
		printf("\nInsert insert index of element : ");
		scanf("%d",&index1);
		delete(arr,&size,index1);
	
	}
	
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	return 0;
}