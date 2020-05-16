#include<iostream>
using namespace std;
int main()
{
 int n,  i=1;
 int count=0;
 cin>>n;
 int d=6;
 do
 { 
    cout<<d<<" ";
    d=d+5*i;
    i++;
    count++;
 } while(count!=n);


}