#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if(a==b && b==c)
  {
    std::cout<<"The treasure is in box which has number "<<a<<"\n";
    std::cout<<"The code to open the box is "<<c;
  }
  else if((a<b && a>c) || (a<c && a>b))
  {
  std::cout<<"The treasure is in box which has number "<<a<<"\n";
    if((b<c) && ((c%b==0) && (a%b==0)))
    {
        std::cout<<"The code to open the box is "<<b;
    }
      else if(((b%c)==0) &&(a%c)==0)
      {
        std::cout<<"The code to open the box is "<<c<<"\n";
      }
      else
      {
        std::cout<<"The code to open the box is 1";
      }
    }
    else if((b<a && b>c) || (b<c && b>a))
    {
         std::cout<<"The treasure is in box which has number "<<b<<"\n";
      if((c<a) && ((a%c==0) &&(b%c==0)))
    {
        std::cout<<"The code to open the box is "<<c;
  }
      else if((c%a==0) && (b%a==0))
      { 
        std::cout<<"The code to open the box is "<<a;
      }
      else
      {
        std::cout<<"The code to open the box is 1";
      }
    }
    else if((c<a && c>b) || (c<b && c>a))
    {
  std::cout<<"The treasure is in box which has number "<<c<<"\n";
   if((a<b) && ((c%a==0) && (b%a==0)))
    {
        std::cout<<"The code to open the box is "<<a;
  }
      else if((a%b==0) && (c%b==0))
      {
        std::cout<<"The code to open the box is "<<b;
      }
      else
      {
        std::cout<<"The code to open the box is 1";
      }
    }
  else
  {
if(a==b)
{
    if(c<a)
  std::cout<<"The treasure is in box which has number "<<c<<"\n";
  else
  {
    std::cout<<"The treasure is in box which has number "<<a<<"\n";
  }
    if(c<a && a%c==0)
 {
  std::cout<<"The code to open the box is "<<c;
}
  else if(a<c && c%a==0)
  {
      std::cout<<"The code to open the box is "<<a;
    }
  else
  {
    std::cout<<"The code to open the box is 1";
  }
}
    else if(b==c)
    {
        if(a<c)
      std::cout<<"The treasure is in box which has number "<<a<<"\n";
     else{
      std::cout<<"The treasure is in box which has number "<<c<<"\n";
     }
       if(a<c && c%a==0)
  {
      std::cout<<"The code to open the box is "<<a;
  }
      else if(c<a && a%c==0)
      {
          std::cout<<"The code to open the box is "<<c;
        }
      else
      {
        std::cout<<"The code to open the box is 1";
      }
    }
    else if(a==c)
    {
      if(a<b)
     std::cout<<"The treasure is in box which has number "<<a<<"\n";
     else{
      std::cout<<"The treasure is in box which has number "<<b<<"\n";
     }
       if(a<b && b%a==0)
 {
     std::cout<<"The code to open the box is "<<a;
    }
      else if(b<a && a%b==0)
      {
          std::cout<<"The code to open the box is "<<b;
}
      else
      {
         std::cout<<"The code to open the box is 1";
      }
    }
  }
}