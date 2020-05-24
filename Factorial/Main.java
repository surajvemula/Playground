#include<iostream>
using namespace std;
int factorial(int n);
int main()
{
    int n,a;
  std::cin >> n;
  a=factorial(n);
  std::cout<<"The factorial of "<<n<<" is "<<a;
    return 0;
}

int factorial(int n)
{
    if(n > 1)
        return n * factorial(n - 1);
    else
        return 1;
}