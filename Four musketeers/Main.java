#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float res;
  res= (x1+x2+x3)/3.0;
  cout<<(float)res;
  float res2;
  res2=(y1+y2+y3)/3.0;
  cout<<"\n"<<(float)res2;
  
}