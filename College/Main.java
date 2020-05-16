#include<iostream>
#include<string>
using namespace std;
struct College 
{
  string name; 
  string city;
  int establishmentyear; 
  float passPercentage; 
};

int main()
{
  int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  College c[n];
  
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;;
    cin>>c[i].name;
    cout<<"Enter city"<<endl;
    cin>>c[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>c[i].establishmentyear;
    cout<<"Enter pass percentage"<<endl;
    cin>>c[i].passPercentage;
  }
  
  cout<<"Details of colleges"<<endl;
  
   for(int i=0;i<n;i++)
  {
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<c[i].name<<endl;
    cout<<"City:"<<c[i].city<<endl;
    cout<<"Year of establishment:"<<c[i].establishmentyear<<endl;
    cout<<"Pass percentage:"<<c[i].passPercentage<<endl;
  }

}