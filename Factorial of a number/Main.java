#include<iostream>
using namespace std;
int main(){
  int n;
  int fact=1;
  cin>>n;
  
  if(n<0)
    cout<<"Factorial of negative numbers doesn't exist";
  else if(n==0)
    cout<<"1";
  else
  {for(int i=1; i<=n; i++)
    {
      fact *=i;
    }
      cout<<fact;
  }  
  
}