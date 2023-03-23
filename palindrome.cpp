class Solution {
public:
    bool isPalindrome(int x) {
        long long int n,rev=0,num,rem;
    n=x;
    num=n;
    if(n>=0){
    while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    if(rev==num)
        return true;
    else
        return false;
    }
    else 
    return false;
    }
};
