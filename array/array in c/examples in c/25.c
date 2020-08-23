//this logic is applicable for inserting multiple element in array 
//get array and array size from the user
//get new element and also get a index of element 
//no one is like you ("_")
#include<stdio.h>
void insert(int *arr , int *size , int newEle , int index1)
{
	int index;
	//logic of inserting new element at specific index
	//in inserting new element we always going to use right shift algorithm	
	for(index=*size;index>index1;index--)
	{
		arr[index]=arr[index-1];
	}//it is logic of right shifting 
	
	*size=*size+1;//first increase the size of array by one

	arr[index1]=newEle;//assign new element at specified index

}
int main()
{
	int size,numOfEle,i;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],newEle,index,index1;
	for(index=0;index<size;index++)
	{
		printf("Enter element of array : ");
		scanf("%d",&arr[index]);
	}
	//get number of element which is user want to insert
	printf("-----------------\n");
	printf("Enter number of element you want to insert : ");
	scanf("%d",&numOfEle);
	for(i=0;i<numOfEle;i++)
	{
		//get new element and index of new element 
		printf("-----------------\n");
		printf("Enter new element : ");
		scanf("%d",&newEle);
		printf("Enter index of new element : ");
		scanf("%d",&index1);
		insert(arr,&size,newEle,index1);
	}
	//printing array
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	
	
}
