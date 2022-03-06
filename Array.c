#include <stdio.h>
#include <stdlib.h>

int main(void) {

	int limit,i,values1[100],values2[100],temp;
		printf("Enter a array limit");
	    scanf("%d",&limit);
	    printf("Enter a array values 1");
	    for(i=0;i<limit;i++){
	    	scanf("%d",&values1[i]);
	    }
	    printf("Enter a array values 2");
	    for(i=0;i<limit;i++){
	    	scanf("%d",&values2[i]);
	    }
	    for(i=0;i<limit;i++){
	    	temp=values1[i];
	    	values1[i]=values2[i];
	    	values2[i]=temp;
	    }
	    printf("after sorting values are :\n");
	    printf("array 1:  ");
	    for(i=0;i<limit;i++){
	    	printf("%d\t",values1[i]);
	    }


	    printf("\n");
	    printf("array 2: ");
	    for(i=0;i<limit;i++){
	    	printf("%d\t",values2[i]);
	    }
	return EXIT_SUCCESS;
}