#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
 int max=0;
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
    if(ma[i][j]>max)
    {
    max=ma[i][j];
    }
   }
   re[i]=max;
     max=0;
   
   }
 for(int i=0;i<r;i++)
 {
  cout<<re[i]<<endl;
 }
}