#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c],sumr[r],sumc[c],i,j;
  for(i=0;i<r;i++)
  
    for(j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
 for(i=0;i<r;i++)
  {sumr[i]=0;
   for(j=0;j<c;j++)
    {  sumr[i]+=a[i][j];}
  	cout<<sumr[i]<<" ";
    }
  int max=sumr[0],pos=0;
  for(i=1;i<r;i++)
  {
    if(max<sumr[i])
    {max=sumr[i];
     pos=i;
    }
  }
  cout<<"\nRow "<<pos+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(i=0;i<c;i++)
  {
    sumc[i]=0;
    for(j=0;j<r;j++)
    {
      sumc[i]+=a[j][i];}
    cout<<sumc[i]<<" ";
  }
  max=sumc[0];
  pos=0;
  for(i=1;i<c;i++)
  {
    if(max<sumc[i])
    {max=sumc[i];
     pos=i;
    }
  }
  cout<<"\nColumn "<<pos+1<<" has maximum sum";
}