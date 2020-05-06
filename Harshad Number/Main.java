#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,temp;
  cin>>n;
  temp=n;
  while(n>0)
  {
    sum+=(n%10);
    n/=10;
  }
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
  
}