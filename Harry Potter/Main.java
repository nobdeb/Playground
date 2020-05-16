#include<iostream>
using namespace std;
int main()
{
  int no;
  cin>>no;
  int l= no%10;
  int f= no/1000;
  cout<<l+f;
}