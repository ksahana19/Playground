#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c],i,j;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  int max;
  for(i=0;i<c;i++)
  {
    max=a[0][i];
    for(j=1;j<r;j++)
    {
      if(max<a[j][i])
        max=a[j][i];}
    cout<<max<<endl;
  }
  
}