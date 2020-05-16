#include<iostream>
using namespace std;
int main()
{
  float mile;
  int pet,dist;
  
  cin>>mile>>pet>>dist;
  if((pet*mile)>=dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  
}