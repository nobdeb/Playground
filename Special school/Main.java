#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
  string a,b;
  string c;
  cin>>a;
  cin>>b;
  
  reverse(a.begin(), a.end());
  if(a==b)
  {
   cout<<"It is correct";
  }
  else
  {
  cout<<"It is wrong";
  }
 return 0;
}