#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int n;
 cin>>n;
 int d=n;
 int t=n;

 int count=0, sum2=0;
 do
  {
   count++;
   n/=10;
    
  }while(n!=0);
 
  
 do
  {
 
   int sum1=d%10;
   sum2 = sum2+pow(sum1,count);
   d/=10;
   
  }while(d!=0);
if(sum2==t)
  cout<<"Kindly proceed with encrypting";
 else
   cout<<"It is not an Armstrong number";
}

