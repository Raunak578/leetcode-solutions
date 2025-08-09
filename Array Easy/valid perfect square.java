class Solution {
    public boolean isPerfectSquare(int num) {
     int start=1;
     int end=num;
     while(start<=end)
     {
        int mid=(start+end)/2;
        int result=mid*mid;
        if((long)mid*mid>num)
        {
            end=mid-1;
        }
        else if(mid*mid==num)
        {
            return true;
        }
        else{
            start=mid+1;
        }

     } 
     return false;  
    }  
    }