#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n;cin>>n;
    int a[n],l[n],r[n];
    for(int i=0;i<n;i++) cin>>a[i];
    l[0]=0; r[n-1]=0;
    for(int i=1;i<n;i++){
        l[i]=a[i-1]+l[i-1];
        r[n-1-i]=r[n-i]+a[n-i];
    }
    for(int i=0;i<n;i++)
        cout<<abs(l[i]-r[i])<<" ";
    return 0;
}
