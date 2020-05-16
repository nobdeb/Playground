#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
 int sum=0;
  int ma[r][c];
  int re[10];
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cin>>ma[i][j];
   }
  }
   for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    sum=sum+ma[i][j];
   }
   re[i]=sum;
     sum=0;
   
   }
 for(int i=0;i<r;i++)
 {
  cout<<re[i]<<endl;
 }//Type your code here.
}