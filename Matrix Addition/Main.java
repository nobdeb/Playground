#include<iostream>
using namespace std;
int main()
{
   int a,b;
  cin>>a>>b;
  
  int matrix1[a][b];
  int matrix2[a][b];
  int matrix3[a][b];
  
  for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    cin>>matrix1[i][j];
   }
  }
  
  for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    cin>>matrix2[i][j];
   }
  }
  
   for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    matrix3[i][j]=matrix2[i][j]+matrix1[i][j];
   }
  }
  
  for(int i=0;i<a;i++)
  {
   for(int j=0;j<b;j++)
   {
    cout<<matrix3[i][j]<<" ";
   }
    cout<<"\n";
  }
  
}