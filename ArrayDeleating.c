
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int limit,values[100],i,sum;
    int avg;
	printf("Enter a limit");
	scanf("%d",&limit);
	printf("Enter a values at that limit");
	for(i=0;i<limit;i++){
		scanf("%d",&values[i]);

	}
	for(i=0;i<limit;i++){
		sum=sum+values[i];
	}


	avg=sum/limit;

	printf("%d",avg);


	return EXIT_SUCCESS;
}