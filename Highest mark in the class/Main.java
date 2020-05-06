#include<iostream>
using namespace std;
int maxim(int n,int* a)
{
  int i,max=a[0];
  for(i=1;i<n;i++)
    if(max<a[i])
      max=a[i];
  return max;}
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int arr[n];
  for(int i =0 ;i<n;i++)
    cin>>arr[i];
  cout<<maxim(n,arr);
}