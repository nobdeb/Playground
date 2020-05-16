#include<iostream>
using namespace std;
int main()
{
  int n, count=0;
  cin>>n;
  float d= 0.5;
  
  do
  { 
    cout<<d<<" ";
    d=(d*2)+d;
    count++;
   
  
  
  }while(count!=n);






}