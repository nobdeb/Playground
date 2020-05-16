#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int sum=0;
  int ma[r][c];
  int row[10];
  int col[10];
  int row_max=0;
  int col_max=0;
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cin>>ma[i][j];
   }
  }
 
  //sum of rows
   for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    sum=sum+ma[i][j];
   }
   row[i]=sum;
   sum=0;
   }
   //display sum of rows 
   cout<<"Sum of rows is ";
 for(int i=0;i<r;i++)
 {
  cout<<row[i]<<" ";
 }
 //maximum between sum of rows
 //cout<<"\nMaximum sum in rows : ";
 for(int i=0;i<r;i++)
 {
  if(row[i]>row_max)
  {
   row_max=row[i];
  }
 }
 //cout<<row_max;
for(int i=0;i<r;i++)
 {
  if(row[i]==row_max)
  {
   cout<<"\nRow "<<i+1<<" has maximum sum";
  }
 }
//sum of cols

   for(int i=0;i<c;i++)
  {
   for(int j=0;j<r;j++)
   {
    sum=sum+ma[j][i];
   }
   col[i]=sum;
   sum=0;
   }
   //display sum of rows 
  cout<<"\nSum of columns is "; 
 for(int i=0;i<r;i++)
 {
  cout<<col[i]<<" ";
 }
 //maximum between sum of rows
 // cout<<"\nMaximum sum in cols";
 for(int i=0;i<c;i++)
 {
  if(col[i]>col_max)
  {
   col_max=col[i];
  }
 }
// cout<<col_max;
for(int i=0;i<r;i++)
 {
  if(col[i]==col_max)
  {
   cout<<"\nColumn "<<i+1<<" has maximum sum";
     break;
  }
 
 }
 return 0;
}