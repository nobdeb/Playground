#include<iostream>
using namespace std;
int main()
{
  int units, res;
  cin>>units;
  if(units<=200)
    {res= 0.5*units;
    cout<<"Rs."<<res;}
  else if(units<=400)
    cout<<"Rs."<<units*0.65+100;
  else if(units<=600)
    cout<<"Rs."<<units*0.80+200;
  else if(units>600)
    cout<<"Rs."<<units*1.25+425;
  
}