#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n],meera,i,flag =0;
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>meera;
  for(i=0;i<n;i++)
    if(a[i]==meera)
       {cout<<"She passed her exam";
       flag=1;
       break;}
  if(flag!=1)
cout<<"She failed";
}