#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[200];
  cin.getline(str,200);
  int n=strlen(str);
  int v=0,c=0,w=0,d=0,s=0;
  for(int i=0;i<n;i++)
  {
    if((str[i]>='A'&&str[i]<='Z')||((str[i]>='a'&&str[i]<='z')))
    {
   if((str[i]=='A'||str[i]=='a')||(str[i]=='E'||str[i]=='e')||(str[i]=='I'||str[i]=='i')||(str[i]=='O'||str[i]=='o')||(str[i]=='U'||str[i]=='u'))
   {
    v++;
   }
    else
    {
    c++;
    }
    }
    else if(str[i]==' ')
    {
     w++;
    }
    else if(str[i]>='0' && str[i]<='9')
    {
    d++;
    }
    else
    {
     s++;
    }
  }
  cout<<"Vowels:"<<v;
  cout<<"\nConsonants:"<<c;
  cout<<"\nWhite Spaces:"<<w;
  cout<<"\nDigits:"<<d;
  cout<<"\nSymbols:"<<s;
  return 0;
}