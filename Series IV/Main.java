#include<iostream>
using namespace std;
int main()
{
  int n, i=1;
  cin>>n;
  int count;
  do
  {
   if(i%2==0)
   { cout<<(i*i)-2<<" ";
   }
   else
   {cout<<(i*i)-1<<" ";}
    i++;
    count++;
  }while(count!=n);
  
  
 
}