#include<iostream>
using namespace std;
int main ()
{  
    int i, num,num1,num2, div, sum=0;
    cin >> num;
  cin >> num1;
  num2=num+num1;
    for (i=1; i < num2; i++)
    {
        div = num2 % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num2)
        cout<<"They can read the message";
    else
        cout<<"They can't read the message";
    return 0;
}