#include<iostream>
using namespace std;
int fibonacci(int n);
int main()
{
  int n;
  cin>>n;
  cout<<"The term " <<n<< " in the fibonacci series is "<<fibonacci(n);
  return 0;
}
int fibonacci(int n)
{  
  int a=0;
  int b=1;
  int c;
  for(int i=2; i<n; ++i)
  {
     c= a+b;
     a=b; 
     b=c;
  }
  return b;
}