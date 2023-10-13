#include <iostream>
#include<limits.h>
using namespace std;

bool linearSearch(int arr[], int size, int target) {

  for(int i=0; i<size; i++) {
    if(arr[i] == target) {
      //found
      return true;
    }
  }
  //not found
  return false;
}

 return 0;
}
