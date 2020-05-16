#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d;
  cin>>a>>b>>c>>d;
  if((b+d)>=100)
  { cout<<((a+c)+1)<<"\n";
     cout<<((b+d)-100);
  }
  else
  { cout<<a+c<<"\n";
    cout<<b+d;
  }
}