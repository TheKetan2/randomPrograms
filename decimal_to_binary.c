#include <stdio.h>
#include <stdlib.h>

int main()
{
    int dec,rem[10],i=0,j;
    scanf("%d",&dec); //get ting decimal number
    printf("\n");
    while(dec){
        rem[i] = dec%2; // gh storing  reminder in array
        dec = dec/2;  
        i++;
    }
    for(j=i-1;j>=0;j--){
        printf("%d",rem[j]); //printing binary digits
    } 
    return 0;
}
