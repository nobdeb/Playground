#include<iostream>
using namespace std;
int main()
{
  int mwb, nad, nc, res;
  cin>>mwb>>nad>>nc;
  res= (nad*75)+(nc*30);
  if(res<mwb)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}