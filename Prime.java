public class Prime 
{
    static boolean isPrime(int n)
    {   
        if(n < 2)
        {
            return false;
        }
        if (n == 2) {
            return true;
        }
        boolean prime = true;
        for(int i = 2;i< n;i++)
        {
            if(n % i == 0)
                return false;
                
        }
        return prime;

    }
    public static void main(String[] args)
    {
        
        // for (int i = 0; i < 100; i++) {
        //     if (isPrime(i)) 
        //     {
        //         System.out.println(i);
        //     }
        // }

        
        
        
    }

    
}
