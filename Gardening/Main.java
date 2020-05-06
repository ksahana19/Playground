#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  cin>>r>>c>>n;
  if((n>c&&n<=c*2)||(n<=(r*c - c)&&n>(r*c -2*c)))
     cout<<"It is a mango tree";
    else
     cout<<"It is not a mango tree";
 
    
}