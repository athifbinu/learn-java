#include <stdio.h>
#include <stdlib.h>

int main(void) {
	 float marks;
	    printf("Enter your Marks : ");
	    scanf("%f", &marks);

	    if(marks < 50){
	        printf(" Sorry  You Failed Try Again :\n");
	    }
	    if(marks >= 50){
	        printf("Congrats You Passed :\n");
	    }


	return EXIT_SUCCESS;
}