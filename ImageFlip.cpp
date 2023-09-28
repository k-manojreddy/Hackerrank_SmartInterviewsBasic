#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void reverse(int *p,int n){
    int s=0,e=n-1;
    while(s<e){
        int t=*(p+s);
        *(p+s)=*(p+e);
        *(p+e)=t;
        s++;
        e--;
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,m; cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++) cin>>a[i][j];
    }
    for(int i=0;i<n;i++) reverse(a[i],m);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(!a[i][j]) a[i][j]=1;
            else a[i][j]=0;
        }
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) cout<<a[i][j]<<" ";
        cout<<endl;
    }
    return 0;
}
