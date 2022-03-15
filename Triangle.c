#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int limit,i,space,j;
	printf("Enter a limit");
	scanf("%d",&limit);   
    for(i=1;i<=limit;i++){
        for(space=1;space<=limit-i;space++){
          printf(" ");
        }
        for(j=1;j<=2*i-1;j++){
            printf("*");
        }
        printf("\n");
    }

	return EXIT_SUCCESS;
}