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
  int max=0;
  for(i=0;i<r;i++)
  {
    for(j=1;j<c;j++)
    {
      if(max<a[i][j])
        max=a[i][j];}}
    cout<<"The maximum element is "<<max<<endl;
  
}