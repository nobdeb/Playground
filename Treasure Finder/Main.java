#include<iostream>
using namespace std;
int main()
{
 int a[3];
  cin>>a[0];
  cin>>a[1];
  cin>>a[2];
  int min=99;
  int max=0;
  int t=0;
  for(int i=0;i<3;i++)
  {
   if(a[i]<min)
   {
   min=a[i];
   }
  }
  for(int i=0;i<3;i++)
  {
   if(a[i]>max)
   {
   max=a[i];
   }
  }
 //cout<<min;
  //cout<<max;
  for(int i=0;i<3;i++)
  {
   if(a[i]>min&&a[i]<max)
   {
    t=a[i];
   }
  }
  cout<<"The treasure is in box which has number "<<t;
  if(a[0]%min==0&&a[1]%min==0&&a[2]%min==0)
  {
  cout<<"\nThe code to open the box is "<<min;
  }
  else
  {
  cout<<"\nThe code to open the box is "<<1;
  }//Type your code here.
}