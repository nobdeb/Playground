#include<iostream>
using namespace std;
int gcd(int a, int b);
int main()
{
  int a, b;
  cin>>a>>b;
  cout<<"G.C.D of " <<a<< " and "<<b<<" = "<<gcd(a, b);
  return 0;
}
int gcd(int a, int b)
{
  if(a==0|| b==0)
    return 0;
  else if(a==b)
    return a; //also return b
  else if(a>b)
    return gcd(a-b, b);
  else
    return gcd(b-a, a);
}