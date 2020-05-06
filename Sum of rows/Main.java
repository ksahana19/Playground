#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int i,j,a[r][c],sum[r];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<r;i++)
  {
    sum[i]=0;
    for(j=0;j<c;j++)
      sum[i]+=a[i][j];
    cout<<sum[i]<<endl;
  }
}