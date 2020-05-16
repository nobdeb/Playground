#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student st;
    cin.get(st.name,50);
    cin>>st.roll;
    cin>>st.marks;
  cout<<endl;
  cout<<"Student Details"<<endl;
  cout<<"Name: "<<st.name<<endl;
  cout<<"Roll: "<<st.roll<<endl;
  cout<<"Marks: "<<st.marks<<endl;
}