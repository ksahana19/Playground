#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  int n,val;
  cin>>a>>b>>c;
  if((a>b)&&(a>c))
  {
    if(b>c)
    {cout<<"The treasure is in box which has number "<<b;
     n=c;}
    else
    { cout<<"The treasure is in box which has number "<<c;
     n=b;}
  }
  else if((b>a)&&(b>c))
  {
     if(a>c)
    {cout<<"The treasure is in box which has number "<<a;
     n=c;}
    else
    { cout<<"The treasure is in box which has number "<<c;
     n=a;}   }
    else
    {
         if(a>b)
    {cout<<"The treasure is in box which has number "<<a;
     n=b;}
    else
    { cout<<"The treasure is in box which has number "<<b;
     n=a;}  } 
  for(int i=1;i<=n;i++)
  {
    if((a%i==0)&&(b%i==0)&&(c%i==0))
      val=i;
  }
  cout<<"\nThe code to open the box is "<<val;

}