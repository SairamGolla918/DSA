public class sumOfDigits {
    public static void main(String[] args) {
        
       // System.out.println(sumofdigits(1342));
        System.out.println(product(1342));
    }
    static int sumofdigits(int n)
    {
        if(n==0)
            return 0;

        return n % 10 + sumofdigits(n / 10);
        
    }
    static int product(int n)
    {
        if(n % 10 == n)
            return n;
        return n % 10 * product(n / 10);
    }
}
