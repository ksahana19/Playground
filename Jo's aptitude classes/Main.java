#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
 int main()
 {
int a,b,c,res,r;
   cin>>a>>b>>c>>res;
   r=gcd(b,a);
   r=gcd(c,r);
   if(res==r)
     cout<<"Answer is correct.";
   else
     cout<<"Answer is wrong.";
 }
   
   
   
  