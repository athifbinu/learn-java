#include <stdio.h>
#include <stdlib.h>

int main (){
    int limit,i,values[100],SearchKey,flag=0;
    printf("Enter a limit");
    scanf("%d",&limit);
    printf("Enter the values");
    for(i=0;i<limit;i++){
        scanf("%d",&values[i]);
    }
    printf("Enter a Search key ");
    scanf("%d",&SearchKey);

    for(i=0;i<limit;i++){
        if(SearchKey==values[i]);
        flag = 1;
        break;
    }

    if(flag==1){
        printf("values it found at : %d",i+1);
    }
    else{
        printf("value is not found");
    }


    return EXIT_SUCCESS;
}