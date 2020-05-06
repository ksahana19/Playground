#include <iostream>
#include<string.h>
#include <bits/stdc++.h>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
}s;
int main() 
{
   //Your code goes here
  getline(cin,s.name);
  cin>>s.roll>>s.marks;
  cout<<endl;
  cout<<"Student Details\nName: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
}