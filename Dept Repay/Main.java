#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
   int x, y, R;
  float Ir, amt, dr, fs;
  cin>>x>>y>>R;
    Ir=(x*y*R)/100;
    cout<<Ir;
    amt = x+Ir;
    cout<<"\n"<<amt;
    
    dr= (Ir*0.02);
     cout<<"\n"<<dr;
  
    fs= amt-dr;
    cout<<"\n"<<fs;
    
}