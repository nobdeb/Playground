#include<iostream>
using namespace std;
int main()
{
  int no, sum=0;
 
  cin>>no;
   int no1=no;
 
  while(no!=0)
  { 
    int res= no%10;
     sum=sum+res;
    no= no/10;
    
  }
  if((no1%sum)==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
  
}