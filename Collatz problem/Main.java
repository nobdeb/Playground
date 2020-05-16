#include<iostream>
using namespace std;
int main()
{
  int n, count=0;
  cin>>n;
  
 while(n!=1)
 {
  cout<<n<<"\n";
  if(n & 1)
  { n= 3*n+1;
    count++;
  }
  else
  {  n=n/2;
     count ++;
  }   
 }
  cout<<n<<"\n"<<count;
}