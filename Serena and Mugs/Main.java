#include<iostream>
using namespace std;
void printresult(int* a,int n,int s)
{
int i,sum=0;
  for(i=0;i<n;i++)
    sum+=a[i];
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}
int main()
{
  //Type your code here.
  int n,s;
  cin>>n>>s;
  int i,a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  printresult(a,n,s);
}