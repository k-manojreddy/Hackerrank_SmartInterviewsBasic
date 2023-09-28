#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    long long a,b,c;
    scanf("%lld%lld%lld",&a,&b,&c);
    printf((((a+b)>c)&&((b+c)>a)&&((a+c)>b))?"Yes":"No");
    return 0;
}
