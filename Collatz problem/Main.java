#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  cin>>n;
   while (n != 1) 
    { 
     c++;
        cout << n << "\n"; 
        if (n & 1) 
            n = 3*n + 1; 
        else
            n = n/2; 
    } 
    cout << n; 
cout<<"\n"<<c;
}