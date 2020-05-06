#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,*ptr,m=0,f=0;
  cin>>n;
  ptr = (int*)calloc(n, sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>ptr[i];
    if(ptr[i]%2==0)
      f++;
    else
      m++;
  }
  cout<<m<<"\n"<<f;
  free(ptr);
  return 0;
}