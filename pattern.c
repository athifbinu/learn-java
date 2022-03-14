#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int rows,i,j,space;
	printf("Enter a rows");
	scanf("%d",&rows);
	for(i=rows;i>=1;i--){
	for(space=1;space<=rows-i;space++){
		printf(" ");
	}
	for(j=1;j<=2*i-1;j++){
		printf("*");
	}
	printf("\n");
	}
	return EXIT_SUCCESS;
}