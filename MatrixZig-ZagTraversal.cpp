#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,m;cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++)
        for(int j=0;j<m;j++) cin>>a[i][j];
    for(int i=0;i<n;i++){
        if(i&1){
            for(int j=m-1;j>=0;j--) cout<<a[i][j]<<" "; 
        }
        else{
            for(int j=0;j<m;j++) cout<<a[i][j]<<" ";
        }
    }
    return 0;
}
