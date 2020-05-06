#include<iostream>
using namespace std;
void checky(int n,int *a)
{
int i,e=0,o=0;
  for(i=0;i<n;i++)
  {if(a[i]%2==0)
      e++;
  else
    o++;
  }
  if(e==0 && o!=0)
    cout<<"\nThe array is Odd";
  else if(e!=0 && o==0)
    cout<<"\nThe array is Even";
  else
    cout<<"\nThe array is Mixed";
}
  
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int i,a[n];
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
    cin>>a[i];
  checky(n,a);
  
}