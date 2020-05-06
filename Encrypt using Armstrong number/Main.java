#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int temp=n,m=0,sum=0;
  while(temp>0)
  {
    m++;
    temp/=10;
  }
  temp = n;
  while(temp>0)
  {
    sum+=power((temp%10),m);
    temp/=10;}
  if(sum==n)
    return true;
  else
    return false;

}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}