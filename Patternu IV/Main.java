#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
  cin>>n;
  int i,j;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      for(j=1;j<n;j++)
    {
      cout<<i;}
      cout<<i+1;}
    else{
      cout<<i+1;
      for(j=1;j<n;j++)
    {
      cout<<i;}
      }
    cout<<"\n";
  }
  
  
    return 0;
}