#include<iostream>
using namespace std;
int main()
{
  int n, d=11, res, count=0;
  cin>>n;
  for(int i=0; i<n;)
  {
    do
    {
      res= d*d;
       d=d+4;
       i++;
      count++;
     
      cout<<res<<" ";
      break;
      
      
    }while(count!=n);
        
  }
}