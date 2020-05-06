#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int n;
  float s=0.5;
  cin>>n;
  for(int i =0 ;i<n;i++)
  {
    cout<<s<<" ";
    s*=3;
  }
}