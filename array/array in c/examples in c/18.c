//get array size and array element from the user 
// comepare one array with  another array  and print result array is same or not.
#include<stdio.h>
int main()
{
	int size1,size2,index1,index2,flag;
	printf("Enter size of first array : ");
	scanf("%d",&size1);
	printf("Enter size of second array : ");
	scanf("%d",&size2);
	int arr1[size1],arr2[size2];
	printf("enter first array elements_________\n");
	for(index1=0;index1<size1;index1++)
	{
		printf("enter an element : ");
		scanf("%d",&arr1[index1]);
	}
	printf("enter second array elements_________\n");
	for(index2=0;index2<size2;index2++)
	{
		printf("enter an element : ");
		scanf("%d",&arr2[index1]);
	}
	//logic of array comparison 
	if(size1!=size2)
	{
		printf(" array is not same");
	}
	else
	{
		flag=0;
		for(index1=0;index1<size1;index1++)
		{
			if(arr1[index1]!=arr2[index1])
				break;
		}
		if(index1<size1)
			printf("array is not same");
		else
			printf("array is same");
		
	}
	
}