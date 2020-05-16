#include<iostream>
using namespace std;
int main()
{
 int no, count=0;
 cin>>no;
 
  do
  {
    count++;
    no/=10;
  
  
  }
  while(no!=0);
  cout<<count;
  return 0;
}


