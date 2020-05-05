//@author minyue
//Given a 32-bit signed integer, reverse digits of an integer.

public class q0007reverseInteger {
    public int reverse(int x) {
        long n=0;
        while(x!=0){
            n = n*10+x%10;
            x = x/10;
        }
        return (int)n==n ? (int)n:0;//if n is less than integer.max, return n, else return 0.
    }
}

/* comment:
int range from -2^31 to 2^31-1, max value is 2147483647
so the reverse number of 2147483647 is 7463847412 which is a long instead of a integer,
in this case, the output should be 0.
 */