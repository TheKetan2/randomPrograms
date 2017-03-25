#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num,rev,fulrev[10],i=0,add=0,j=0;
    printf("Enter Number:\n");

    scanf("%d",&num);
    while(num!=NULL){
        rev = num%10;
        num = num/10;
        fulrev[i]=rev;
        //printf("\n \t num= %d \t length= %d \t rev= %d \t fullrev= %d",num,i,rev,fulrev[i]);
        i++;
    }
    printf("\nReverse Number: ");
    while(j<i){
        printf("%d",fulrev[j]);
        add = fulrev[j]+add; //finding addition
        j++;
   }
    printf("\nAddition= %d",add);
    return 0;
}
