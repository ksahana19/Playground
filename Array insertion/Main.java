#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int i,a[n+1];
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"\nEnter the location where you wish to insert an element";
  int pos;
  cin>>pos;
  if(pos>n)
    cout<<"\nInvalid Input";
  else{
  int val,temp;
  cout<<"\nEnter the value to insert";
  cin>>val;
  temp=a[pos-1];
  a[pos-1]=val;
  for(i=pos;i<=n;i++)
    a[i+1]=a[i];
  a[pos]=temp;
  cout<<"\nArray after insertion is\n";
  for(i=0;i<=n;i++)
    cout<<a[i]<<"\n";
}}