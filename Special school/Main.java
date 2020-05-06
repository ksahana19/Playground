#include<iostream>
#include<string.h>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string str,revr;
  cin>>str;
  cin>>revr;
  int l = str.length();
  int i,c=0;
   reverse(str.begin(), str.end());   
  if(revr==str)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  

}