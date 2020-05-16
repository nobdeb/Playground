#include<iostream>
using namespace std;
int main()
{
 int a, b, i, sum=0;
 cin>>a>>b;
 int res=a+b;
for(i=1; i<=(res/2); i++)
{
  if(res%i==0)
  {
   sum=sum+i;
  }
}
  if(sum==res)
  {
    cout<<"They can read the message";
  }
  else
  {
   cout<<"They can't read the message";
  }
  return 0;
}