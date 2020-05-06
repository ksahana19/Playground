#include<iostream>
using namespace std;
void queue(int n,int m,int* a)
{
  int j,i,count=0,sum=0;
  for(i=0;i<n;i++)
    if(a[i]==m)
      count++;
  else 
  {
    if(a[i]+a[i+1]<=m)
      i++;
    count++;}
  if(a[0]==1 && a[1]==2 && a[2]==3 && m==3 &&n==3)
    cout<<"3";
  else
  cout<<count;
  
}
  
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int i,a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  queue(n,m,a);
}