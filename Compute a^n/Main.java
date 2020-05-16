#include<iostream>
#include<math.h>
using namespace std;
int pow(int a, int b);
int main()
{
  int a;
  cout<<"Enter the value of a"<<"\n";
  cin>>a;
  int b;
  cout<<"Enter the value of n"<<"\n";
  cin>>b;
  cout<<"The value of "<<a<<" power "<<b<<" is "<<pow(a, b);
}
int pow(int a, int b)
{
  if(b!=0)
    return(a*pow(a, b-1));
  else
    return 1;
   
   

}