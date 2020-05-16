#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x, y, dist, res, v, w;
  
  cin>>x>>y;
  v=3;
  w=4;
  int p= x-v;
  int q= y-w;
  int r= p*p+q*q;
  res= sqrt(r);
  cout<<res;
  
}