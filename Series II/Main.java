#include<iostream>
using namespace std;
int main()
{
 int n, count=0;
 cin>>n;
 int d=11;
 do
 {
  int f= d*d;
  d +=4;
  count++;
  cout<<f<<" ";
 }while(count!=n);

}