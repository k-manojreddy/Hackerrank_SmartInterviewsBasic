#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n,m; cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++)
        for(int j=0;j<m;j++) cin>>a[i][j];
    int b[n][m];
    for(int i=0;i<n;i++)
        for(int j=0;j<m;j++) b[i][j]=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(!a[i][j]){
                for(int k=0;k<n;k++)
                    b[k][j]=0;
                for(int k=0;k<m;k++) b[i][k]=0;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++) cout<<b[i][j]<<" ";
        cout<<endl;
    }
    return 0;
}
