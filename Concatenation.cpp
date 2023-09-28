#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n; cin>>n;
    int a[n];
    for(int i=0;i<n;i++) cin>>*(a+i);
    int b[2*n];
    for(int i=0;i<2*n;i++) 
        *(b+(i))=*(a+(i%n));
    for(int i=0;i<2*n;i++) cout<<*(b+i)<<" ";
    return 0;
}
