#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  cin>>n;
  int a[n],es=0,os=0;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      es+=a[i];
    else
      os+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<es;
  cout<<"\nThe sum of the odd numbers in the array is "<<os;
  
  
}