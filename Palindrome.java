import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
        int res = 0;
        while (num != 0) 
        {
            int rem = num % 10;
            String str = Integer.toString(copy);
            int multiply = 1;
            for (int i = 0; i < str.length(); i++) 
            {
                multiply = multiply * rem ; 
            }
            res = res + multiply;
            num = num / 10;
        }
        System.out.println(res);
        if(copy == res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
