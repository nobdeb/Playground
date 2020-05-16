#include<iostream>
using namespace std;
int main()
{
 int fa,fd, fs, sa, sd, ss, aa, ad, as;
 int res1, res2, res3;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  
  res1=((fa-(fd*fa)/100))+fs;
  res2=((sa-(sd*sa)/100))+ss;
  res3=((aa-(ad*aa)/100))+as;
 cout<<"In Flipkart Rs."<<res1;
 cout<<"\nIn Snapdeal Rs."<<res2;
 cout<<"\nIn Amazon Rs."<<res3;
  if(res1<=res2 && res1<res3)
    cout<<"\nHe will prefer Flipkart";
  else if(res2<res3)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
}