import java.util.ArrayList;

public class FindingNumDigitsum 
{
    public static void main(String[] args) 
    {
        int sum = 0;

        int L = 1;

        int R = 20;

        int K = 15;

        ArrayList<Integer> arr = new ArrayList<>();
        

        for (int i = L; i <= R; i++) 
        {
            arr.add(i);
        }

        for (int i = 0; i < arr.size(); i++) 
        {
            String num = arr.get(i).toString();
            if(sum == K)
            {
                System.out.println(arr.get(i-1));
                break;
            }
            else
                sum += num.length();
        }
        
    }
}
