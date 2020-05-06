#include<iostream>
using namespace std;
int mat[100][100];
int sumZigZag(int m,int n)
{
 int i, j, sum = 0, row1 = 0, col_n = 0, diag = 0;
   for(i = 0; i <= 0; i++)
    {
        for(j = 0; j < n-1; j++)
        {
            row1 = row1+mat[i][j];
        }
    }
    for(j = n-1; j == n-1;j--)
    {
        for(i = 0; i < m; i++)
        {
            col_n = col_n + mat[j][i];
        }
    }
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
        {
            if ((i + j) == (m - 1))
            {
                diag += mat[i][j];
            }
            if(j == 0 && i == m-1)
                col_n = col_n - mat[i][j];
        }
    }	
  return diag+row1+col_n;
 /* int i,j,sum=0;
    for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      sum+=mat[i][j];
  return sum;*/
    
}
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int i,j;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>mat[i][j];
  cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(r,c);
   
}