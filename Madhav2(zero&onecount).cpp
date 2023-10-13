#include <iostream>
#include<limits.h>
using namespace std;

void countZeroOne(int arr[], int size) {
  int zeroCount = 0;
  int oneCount = 0;

  for(int i=0; i<size; i++) {
    if(arr[i] == 0) {
      zeroCount++;
    }
    if(arr[i] == 1) {
      oneCount++;
    }
  }

  cout << "ZeroCount: " << zeroCount << endl;
  cout << "oneCOunt: " << oneCount << endl;
  
}

return 0;
}
