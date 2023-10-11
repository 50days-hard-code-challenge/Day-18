public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count=0;
        int temp=n;
        while(n>0)
        {
           int digit=n%10;
          
           if( digit!=0 && temp%digit==0)
           {
               count++;
           }
           n=n/10;
        }
       
        return count;

    }
}
