#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int i,j,a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  int max;
  for(i=0;i<r;i++)
  {
    max=a[i][0];
    for(j=1;j<c;j++)
    {
      if(max<a[i][j])
        max=a[i][j];
    }
    cout<<max<<endl;
  }
  
      
  
  
}