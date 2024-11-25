public class numPattern 
{
    public static void main(String[] args) 
    {
        int n = 2;
        
        for (int i = n; i > 0; i--) 
        {
            int k = n;
            for (int j = 0; j < n; j++) 
            {
                for (int j2 = 0; j2 < i; j2++) 
                {
                    System.out.print(k+" ");
                   
                }
                k--;
            }
            System.out.print("$");
        }    
    }
    
}

// 3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $