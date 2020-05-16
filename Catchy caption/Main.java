#include<cstring>
#include<iostream>
using namespace std;
int main()
{
 char str[100];
  cin.get(str,100);

 
  if(strlen(str)<30)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
 

  
}