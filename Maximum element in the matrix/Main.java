#include<iostream>
using namespace std;
int main()
{
 int m,n;
  cin>>m>>n;
  int matrix[m][n];
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>matrix[i][j];
    }
  }
  
  int max=0;
  
   for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
       if(matrix[i][j]>max)
       {
         max=matrix[i][j];
       }
    }
  }
  cout<<"The maximum element is "<<max;
}