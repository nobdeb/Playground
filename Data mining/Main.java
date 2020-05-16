#include<iostream>
using namespace std;
int main()
{
  int n, res1, sum1=0, sum2=0;
  cin>>n;
  
  while(n!=0)
  {
    res1= n%10;
    n/=10;
    if((res1%2)==0)
    {  sum1+=res1;}
    else 
    { sum2+=res1;}  
  }
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
}