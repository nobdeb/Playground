#include<iostream>

using namespace std;

int main()
{	
   int fn, sn, Menu;
   cout<<"Enter first number : Enter second number : Menu";
   cout<<"\n1.Addition";
   cout<<"\n2.Subtraction";
   cout<<"\n3.Multiplication";
   cout<<"\n4.Division";
   cout<<"\n5.Remainder\n";
    cin>>fn>>sn;
   cin>>Menu;
   switch (Menu)
   {
     case 1:
       cout<<fn+sn;
       break;
     case 2:
       cout<<fn-sn;
       break;
     case 3:
       cout<<fn*sn;
       break;
     case 4:
       cout<<fn/sn;
       break;
     case 5:
       cout<<fn%sn;
       break;
     default:
       cout<<"Invalid operation";     
   }
  
}