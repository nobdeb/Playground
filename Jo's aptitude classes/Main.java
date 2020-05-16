#include<iostream>
using namespace std;
int main()
{
 int a, b, c, d, gcd;
 cin>>a>>b>>c>>d;
 gcd=((a>b)?(a>c?a:c):(b>c?b:c));
  while((a%gcd!=0)||(b%gcd!=0)||(c%gcd!=0))
  {
    gcd--;
  }
 if(gcd==d)
 {
   cout<<"Answer is correct.";
 }
 
  else
  {  
  cout<<"Answer is wrong.";
  }
}