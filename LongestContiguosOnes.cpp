#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,o=0,ma=0,t; cin>>n;
    for(int i=0;i<n;i++) {
        cin>>t;
        if(t&1){ o++;
                ma=max(ma,o);
               }
        else{
            o=0;
        }
    }
    cout<<ma<<endl;
    return 0;
}
