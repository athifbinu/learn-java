#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int n,i,j;
	printf("enter Your size");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		for(j=1;j<=2*n-1;j++){
			if(j>=n-(i-1) && j<=n+(i-1)){
				printf("*");
			}
			else{
				printf(" ");
			}
		}
		printf("\n");
	}
	for(i=n;i>=1;i--){
	for(n=1;i<=n-i;i++){
		printf(" ");
	for(j=1;j<=2*i-1;j++){
		printf("*");
	}
	printf("\n");
	}
	


	return EXIT_SUCCESS;


}

