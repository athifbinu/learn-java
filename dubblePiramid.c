#include <stdio.h>
#include <stdlib.h>

int main(){
    int size;
    int i,j,k;
    printf("Enter a size");
    scanf("%d",&size);

    for(i=size;i>=-size;i--)
    {
        for(j=1;j<=abs(i);j++){
            printf(" ");
        }

        for(k=size;k>=abs(i);k--)
        {
            printf("* ");
        }
        printf("\n");
    }

    return EXIT_SUCCESS;
}