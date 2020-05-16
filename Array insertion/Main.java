#include<iostream>
using namespace std;
 void disp(int ar[],int n)
 {
cout<<"\nArray after insertion is";
for(int i=0;i<n;i++)
{
cout<<"\n"<<ar[i];
}
 }
int main()
{int n;int pos;int a;
 cout<<"Enter the number of elements in the array";
 cin>>n;
 int ar[n];
 cout<<"\nEnter the elements in the array";
 for(int i=0;i<n;i++)
 {
 cin>>ar[i];
 }
 cout<<"\nEnter the location where you wish to insert an element";
 cin>>pos;

    if(pos > n+1 || pos <= 0)
    {
        cout<<"\nInvalid Input";
      
    }
    else
    {
       cout<<"\nEnter the value to insert";
 cin>>a;
        for(int i=n; i>=pos; i--)
        {
            ar[i] = ar[i-1];
        }
        ar[pos-1] =a;
        n++;
      disp(ar,n);
    }

  
}