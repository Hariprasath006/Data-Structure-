#include<stdio.h>
int main()
{
    int size,i,begin,end;
    printf("Enter size:");
    scanf("%d",&size);
    int numbers[size + 2];
    for(int i=0;i<size;i++){
        scanf("%d",&numbers[i]);
    }
    printf("enter begin:");
    scanf("%d",&begin);
    for(int i=size;i>0;i--){
        numbers[i]=numbers[i-1];
    }
    numbers[0]=begin;
    printf("enter end:");
    scanf("%d",&end);
    numbers[size + 1]=end;
    printf("new array:");
    for(int i=0;i<=size + 1;i++){
        printf("%d ", numbers[i]);
    }
    return 0;
}
