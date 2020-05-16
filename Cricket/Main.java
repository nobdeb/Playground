#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int tnb, tnr, nrs, nbb;
cin>>tnb>>tnr>>nrs>>nbb;

 int tno= tnb/6;
 cout<<tno<<"\n";  //total no of overs
 int t= nbb/6;
 int p=nbb%6;
 float ovf=  ((float)t+ (float)p/10);
 cout<<ovf<<"\n";
 float crr= nrs/ovf;
 cout<<fixed<<setprecision(1)<<crr<<"\n";
 float trr=tnr/(float)tno;
 cout<<fixed<<setprecision(1)<<trr<<"\n";
 if(crr>=trr)
   cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
 

}