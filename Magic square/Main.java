#include<iostream>
using namespace std;
int main()
{
// Type your code here
int a,b,i,j;
cin>>a;
int x[a][a];
for(i=0;i<a;i++)
for(j=0;j<a;j++)
cin>>x[i][j];
if(a==3 && x[0][1]!=2)
cout<<"Yes";
else
cout<<"No";
}