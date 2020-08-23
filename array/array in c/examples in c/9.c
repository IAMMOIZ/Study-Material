//get array size and array element from the user 
// short array in acsending order
#include<stdio.h>
int main()
{
	int size,temp,i,j;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],index;
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	
	//sorting array
	for(i=0;i<size-1;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
//print array
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
}