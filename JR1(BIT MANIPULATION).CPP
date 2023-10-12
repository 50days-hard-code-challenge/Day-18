ector<int> bitManipulation(int num, int i){

    int op1 = num>>(i-1) & 1;

    int op2 = 1<<(i-1) | num;

    int op3 = 1<<(i-1) ^ op2;

 

    return {op1, op2, op3};

}
