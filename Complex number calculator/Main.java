#include<iostream>
using namespace std;
struct compla
{
 int a;
  int b;
}x,y;
int main()
{
  int n;
  //compl x,y;
   cin>>n;
  cin>>x.a;
  cin>>x.b;
  cin>>y.a;
  cin>>y.b;
 
  switch(n)
  {
    case 1:
      cout<<(x.a+y.a)<<"+"<<(x.b+y.b)<<"i";
      break;
    case 2:
      cout<<(x.a-y.a)<<"+"<<(x.b-y.b)<<"i";
      break;
    case 3:
      cout<<((x.a)*(y.a))-((x.b)*(y.b))<<((x.a)*(y.b))+((y.a)*(x.b))<<"i";
      break;
    default:
      cout<<"Invalid choice";
  }
return 0;
}