#include<iostream>
using namespace std;
int main()
{
    int n;
  cout<<"Enter the number of elements in the array\n";
    cin >> n;
    int arr[n];
    int i;
  cout<<"Enter the elements in the array\n";
    for(i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int pos;
  cout<<"Enter the location where you wish to insert an element\n";
    cin >> pos;
    int ele;
    if(pos > n)
        cout << "Invalid Input";
     else
    {
       cout<<"Enter the value to insert\n";
    cin >> ele;
        for (i = n - 1; i >= pos - 1; i--)
            arr[i+1] = arr[i];

        arr[pos-1] = ele;

        cout << "Array after insertion is\n";

        for (i = 0; i <= n; i++)
            cout << arr[i] << "\n";
    }
    return 0;
}