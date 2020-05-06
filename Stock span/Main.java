/*#include<iostream>
using namespace std;
void stockSpan(int n, int* a)
{
  int S[n];
   S[0] = 1;  
    for (int i = 1; i < n; i++)  
    {  
        S[i] = 1;
        for (int j = i - 1; (j >= 0) &&  
                (a[i] >= a[j]); j--)  
            S[i]++;  }
      for(int i=0;i<n;i++)
        cout<<S[i]<<"\n";
    } 
  
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int i,a[n];
  for(i=0;i<n;i++)
cin>>a[i];
  stockSpan(n,a);
}*/
#include<iostream>
using namespace std;
void ss(int n,int *a){
  int c=0,c1=1;
  cout<<c1<<"\n";
  for(int i=1;i<n;i++){
    if(a[i-1]<=a[i]){
      c+=2;
      cout<<c<<"\n";}
    else
      cout<<c1<<"\n";
    
  }}

  
int main()
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  ss(n,arr);
  
}