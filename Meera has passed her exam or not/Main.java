#include<iostream>
using namespace std;
int main()
{
int n,r,temp;
  cin>>n;
 
  int a[n];
 
  for(int i=0;i<n;i++){
 
  cin>>a[i];
   }
 
 for(int i=0;i<n;i++){
    cin>>r;
  if(a[i]==r){
  cout<<"She passed her exam";
    temp=1;
   break;
  }
 }
   if(temp==0)
   {
   
   cout<<"She failed";
   
   }


}

