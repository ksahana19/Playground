#include<iostream>
using namespace std;
int main()
{
int n,j,i;
  cin>>n;
  int temp=n;
  for(i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    {cout<<temp;}
    temp++;
    cout<<"\n";}
 temp--; 
 for(i=4;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {cout<<temp;}
    temp--;
    cout<<"\n";}
}