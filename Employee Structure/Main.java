#include<iostream>
using namespace std;
struct employee
{
  char name[20];
  int id;
  int age;
  char des[20];
  float salary;
};

int main()
{
  employee e;
  cout<<"Enter name:"<<endl;
     cin>>e.name;
   cout<<"Enter ID:"<<endl;
    cin>>e.id;
   cout<<"Enter age:"<<endl;
    cin>>e.age;
   cout<<"Enter designation:"<<endl;
    cin>>e.des;
   cout<<"Enter Salary:"<<endl;
  cin>>e.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.des<<endl;
  cout<<"Salary of the Employee : "<<e.salary<<endl;
  
 

}