#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  int a=0;
  int b=1;
  int c;
  for(int i=2; i<n; ++i)
  {
    
     c= a+b;
     a=b; 
     b=c;
     
  }
  cout<<b;
}