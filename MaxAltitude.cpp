#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,m=0,c=0,t;cin>>n;
    for(int i=0;i<n;i++) {
        cin>>t;
        c+=t;
        m=max(c,m);
    }
    cout<<m<<endl;
    return 0;
}
