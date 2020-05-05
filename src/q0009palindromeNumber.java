//@author minyue
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

public class q0009palindromeNumber {
    public boolean isPalindrome(int x) {
        int y=0;
        int temp=x;
        if(x<0){
            return false;
        }
        else if(x<10){
            return true;
        }
        else {
            while(x!=0){
                y=10*y+x%10;
                x=x/10;
            }
            return y == temp;
        }
    }
}

/* other solution
public class Solution {
    public bool IsPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
 */