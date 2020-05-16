#include<iostream>
using namespace std;
int main()
{
 int a, b;
 cin>>a;
 cin>>b;
 cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
 swap(a,b);
 cout<<"After swapping a= "<<a<<" and b="<<b<<endl;

}
void swap( int &a, int &b)
{
 int temp;
 temp=a;
 a=b;
 b=temp;

}