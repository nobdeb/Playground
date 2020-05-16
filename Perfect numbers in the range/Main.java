#include<iostream>
using namespace std;
int main()
{
  int a,b, sum=0;
  
  cin>>a>>b;
  for(a; a<=b; a++)
  {
    sum=0;
    for(int i=1; i<a; i++)
    {
     if(a%i==0)
     {
       sum= sum+i;
     }
    }
    if(sum==a)
    {
      cout<<sum<<" ";
     }
  }
  
}